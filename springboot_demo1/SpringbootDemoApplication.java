package com.techproed.springboot_demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		/*That code below will execute the springboot project */ 
		SpringApplication.run(SpringbootDemoApplicationLoose.class, args);
		
		/* Inside the main method, let's create a Laptop object */
		Laptop l1 = new Laptop(); // every time you use new keyword, you create a new object, which is not good because new object means more memory.
								// Instead, you can go with loose coupling
		
		/* To be able to use Laptop l1, we need a battery object */
		l1.setB(new Battery()); /* If I make any mistake over here, everything will down as there is a tight coupling over here.
		/* Continue with the battery class*/
		
		l1.setPrice(1200);
		l1.turnOnLaptop(); /*This is the method that we created in Laptop class, remember? */
		
		/* Let's create a constructor inside the Laptop class and put a message in it*/
		/* Continuing with Laptop...*/ 
	}

}
