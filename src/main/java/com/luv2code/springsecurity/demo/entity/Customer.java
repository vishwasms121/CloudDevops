package com.luv2code.springsecurity.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking_detail")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "track_id")
    private int trackId;

    @Column(name = "source_name")
    private String sourceName;

    @Column(name = "source_address")
    private String sourceAddress;

    @Column(name = "source_city")
    private String sourceCity;

    @Column(name = "source_state")
    private String sourceState;

    @Column(name = "source_pincode")
    private String sourcePincode;

    @Column(name = "source_phone")
    private String sourcePhone;

    @Column(name = "container_weight")
    private double containerWeight;

    @Column(name = "container_price")
    private double totalPrice;

    @Column(name = "reciever_name")
    private String recieverName;

    @Column(name = "reciever_address")
    private String recieverAddress;

    @Column(name = "reciever_city")
    private String recieverCity;

    @Column(name = "reciever_state")
    private String recieverState;

    @Column(name = "reciever_pincode")
    private String recieverPincode;

    @Column(name = "reciever_phone")
    private String recieverPhone;

    @Column(name = "shipment")
    private String shipment;

    public Customer() {
    }

    public Customer(int trackId, String sourceName, String sourceAddress, String sourceCity, String sourceState,
            String sourcePincode, String sourcePhone, double containerWeight, double totalPrice, String recieverName,
            String recieverAddress, String recieverCity, String recieverState, String recieverPincode,
            String recieverPhone, String shipment) {
        this.trackId = trackId;
        this.sourceName = sourceName;
        this.sourceAddress = sourceAddress;
        this.sourceCity = sourceCity;
        this.sourceState = sourceState;
        this.sourcePincode = sourcePincode;
        this.sourcePhone = sourcePhone;
        this.containerWeight = containerWeight;
        this.totalPrice = totalPrice;
        this.recieverName = recieverName;
        this.recieverAddress = recieverAddress;
        this.recieverCity = recieverCity;
        this.recieverState = recieverState;
        this.recieverPincode = recieverPincode;
        this.recieverPhone = recieverPhone;
        this.shipment = shipment;
    }

    public Customer(int id, int trackId, String sourceName, String sourceAddress, String sourceCity, String sourceState,
            String sourcePincode, String sourcePhone, double containerWeight, double totalPrice, String recieverName,
            String recieverAddress, String recieverCity, String recieverState, String recieverPincode,
            String recieverPhone, String shipment) {
        this.id = id;
        this.trackId = trackId;
        this.sourceName = sourceName;
        this.sourceAddress = sourceAddress;
        this.sourceCity = sourceCity;
        this.sourceState = sourceState;
        this.sourcePincode = sourcePincode;
        this.sourcePhone = sourcePhone;
        this.containerWeight = containerWeight;
        this.totalPrice = totalPrice;
        this.recieverName = recieverName;
        this.recieverAddress = recieverAddress;
        this.recieverCity = recieverCity;
        this.recieverState = recieverState;
        this.recieverPincode = recieverPincode;
        this.recieverPhone = recieverPhone;
        this.shipment = shipment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getSourceCity() {
        return sourceCity;
    }

    public void setSourceCity(String sourceCity) {
        this.sourceCity = sourceCity;
    }

    public String getSourceState() {
        return sourceState;
    }

    public void setSourceState(String sourceState) {
        this.sourceState = sourceState;
    }

    public String getSourcePincode() {
        return sourcePincode;
    }

    public void setSourcePincode(String sourcePincode) {
        this.sourcePincode = sourcePincode;
    }

    public String getSourcePhone() {
        return sourcePhone;
    }

    public void setSourcePhone(String sourcePhone) {
        this.sourcePhone = sourcePhone;
    }

    public double getContainerWeight() {
        return containerWeight;
    }

    public void setContainerWeight(double containerWeight) {
        this.containerWeight = containerWeight;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getRecieverName() {
        return recieverName;
    }

    public void setRecieverName(String recieverName) {
        this.recieverName = recieverName;
    }

    public String getRecieverAddress() {
        return recieverAddress;
    }

    public void setRecieverAddress(String recieverAddress) {
        this.recieverAddress = recieverAddress;
    }

    public String getRecieverCity() {
        return recieverCity;
    }

    public void setRecieverCity(String recieverCity) {
        this.recieverCity = recieverCity;
    }

    public String getRecieverState() {
        return recieverState;
    }

    public void setRecieverState(String recieverState) {
        this.recieverState = recieverState;
    }

    public String getRecieverPincode() {
        return recieverPincode;
    }

    public void setRecieverPincode(String recieverPincode) {
        this.recieverPincode = recieverPincode;
    }

    public String getRecieverPhone() {
        return recieverPhone;
    }

    public void setRecieverPhone(String recieverPhone) {
        this.recieverPhone = recieverPhone;
    }

    public String getShipment() {
        return shipment;
    }

    public void setShipment(String shipment) {
        this.shipment = shipment;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}