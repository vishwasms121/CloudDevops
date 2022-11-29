package com.luv2code.springsecurity.demo.controller;

import java.util.List;
import java.util.Random;

import com.luv2code.springsecurity.demo.entity.Customer;
import com.luv2code.springsecurity.demo.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/book")
public class BookController {

    
    private CustomerService theCustomerService;

    @Autowired
    public BookController(CustomerService theCustomerService1) {
        theCustomerService = theCustomerService1;
    }

    @GetMapping("/showCustomerForm")
    public String showMyCustomerForm(Model theModel){

        Customer theCustomer=new Customer();

        theModel.addAttribute(theCustomer);

        return "book-item";
    }

    @PostMapping("/saveCustomer")
    public String save(@ModelAttribute("customer") Customer theCustomer) {

        Random rnRandom=new Random();
		int num=rnRandom.nextInt(1000000);
		if(num>100000) {
			System.out.println(num);
		}
		else {
			num=rnRandom.nextInt(1000000);
			System.out.println(num);
        }
        theCustomer.setTrackId(num);
        double weight=theCustomer.getContainerWeight();
        double price=weight*12;
        theCustomer.setTotalPrice(price);
        System.out.println(num);

        String shipment=theCustomer.getSourceCity();
        theCustomer.setShipment(shipment);

        theCustomerService.save(theCustomer);

        return "confirm";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(Model theModel){
        List<Customer> theCustomer=theCustomerService.findAll();


        theModel.addAttribute("customer",theCustomer);
    
        return "customer-list";
    }


    @GetMapping("/showFormForUpdateShipment")
	public String showFormForUpdate(@RequestParam("employeeId") int theId,
									Model theModel) {
		
		
		Customer theCustomer=theCustomerService.findById(theId);
		
		
		theModel.addAttribute("shipmentval", theCustomer);
		
		// send over to our form
		return "/shipment-form";			
	}

    @GetMapping("/deleteCustomer")
    public String delete(@RequestParam("employeeId") int theId){
        theCustomerService.deleteById(theId);

        return "confirm";
    }

    @PostMapping("/save")
    public String save1(@ModelAttribute("shipmentval") Customer theCustomer){

    //    String str=theCustomer.getRecieverCity();
    //     theCustomer.setShipment(str);

        theCustomerService.save(theCustomer);

        return "confirm";
    }

    @GetMapping("/search")
    public String search(@RequestParam("trackid") int theId,Model theModel){

        List<Customer> theCustomer=theCustomerService.findByTrackId(theId);

        theModel.addAttribute("customer",theCustomer);

        return "customer-list";
    }
    
    @GetMapping("/searchshipment")
    public String searchshipment(@RequestParam("trackid") int theId,Model theModel){

        List<Customer> theCustomer=theCustomerService.findByTrackId(theId);

        theModel.addAttribute("customer",theCustomer);

        return "shipment-search";
    }


    

    
}