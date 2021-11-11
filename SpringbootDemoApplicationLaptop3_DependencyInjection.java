
package com.techproed.springboot_demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.techproed.springboot_demo1.SpringbootDemoApplication;

@SpringBootApplication
public class SpringbootDemoApplicationLaptop3_DependencyInjection {

	public static void main(String[] args) {
		/*That code below will execute the springboot project */ 
		ConfigurableApplicationContext con = SpringApplication.run(SpringbootDemoApplicationLaptop3_DependencyInjection.class, args);
		
		// Let's create an object for Laptop Class
		Laptop l1 = con.getBean(Laptop.class);
		// Let's create 2 more objects and see how many messages that we are going to see
		BatteryA bA = con.getBean(BatteryA.class);
		l1.use(bA); // "use" method within Laptop class for battery A, and without parameter.Inject "bA" inside the use method to use BatteryA as parameter.
		
		Laptop l2 = con.getBean(Laptop.class);
		BatteryB bB = con.getBean(BatteryB.class);
		l2.use(bB); // "use" method within Laptop class for battery B, and without parameter.Inject "bB" inside the use method to use BatteryB as parameter.
		
		
		// Let's try with 0 objects and see whether SpringBoot will show the message or not..
	
		
	
		con.close(); // If you use this, method will close after the execution
	}

}

 