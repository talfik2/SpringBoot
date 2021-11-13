// Loose Coupling Example
package com.techproed.springboot_demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplicationLoose {

	public static void main(String[] args) {
		/*That code below will execute the springboot project */ 
		ConfigurableApplicationContext con = SpringApplication.run(SpringbootDemoApplication.class, args);
		
		/* Inside the main method, let's create a LaptopLoose object */
		/* If you use getBean() method after putting @Component annotation at the top of your class
		you will have a single object for springboot container and springboot will use that single object for all objects*/
		LaptopLoose l1 = con.getBean(LaptopLoose.class); // Hey springboot, get an object from the LaptopLoose class!
		LaptopLoose l2 = con.getBean(LaptopLoose.class);
		
		//Laptop l1 = new Laptop();
        	//Laptop l2 = new Laptop();
		
		l1.turnOnLaptopLoose();
		l2.turnOnLaptopLoose();
	}

}

// As you realized, we didn't use new method
