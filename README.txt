SPRING SECURITY, THYMELEAF and Spring Boot
==========================================


Full solution code is available at this link:
https://github.com/AnshulBharadwaj73/CloudDevops.git

For docs on Spring MVC and Thymeleaf integration, see this link
- https://www.thymeleaf.org/doc/tutorials/3.0/thymeleafspring.html

For docs on Spring Security and Thymeleaf integration, see this link
- https://www.thymeleaf.org/doc/articles/springsecurity.html


A couple of high-level changes
To start making an app in springboot firstly you have to initialize an application using Spring Boot initializer
https://start.spring.io/
Add dependencies :- web, lambok,security.

1. Add the Thymeleaf pom entries

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>
		
		<dependency>
			<groupId>org.thymeleaf.extras</groupId>
			<artifactId>thymeleaf-extras-springsecurity5</artifactId>
		</dependency>

2. Spring Boot Auto-Configuration
When Spring Boot finds Thymeleaf dependency in the Maven POM file, it automatically configures Thymeleaf template engine. 
No need to manually configure Thymeleaf in our code since it is auto-configured by Spring Boot.

3. For Database Configuration for AWS MySQL:
You have to create a DB and provide the endpoint of your DB to the application.property file so the data can be save in DB.



