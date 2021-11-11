
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
		//Laptop l2 = con.getBean(Laptop.class);
		//Laptop l2 = con.getBean(Laptop.class);
		
		// Let's try with 0 objects and see whether SpringBoot will show the message or not..
	
		l1.use(); // Which use method is going to be used ? The one within the BatteryA or the one within the BatteryB?
	
		con.close(); // If you use this, method will close after the execution
	}

}

 