
package com.techproed.springboot_demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplicationLaptop3_DependencyInjection {

	public static void main(String[] args) {
		/*That code below will execute the springboot project */ 
		ConfigurableApplicationContext con = SpringApplication.run(SpringbootDemoApplication.class, args);
		
		/* Inside the main method, let's create a Laptop3 object */
		/* If you use getBean() method after putting @Component annotation at the top of your class
		you will have a single object for springboot container and springboot will use that single object for all objects*/
		Laptop3 l1 = con.getBean(Laptop3.class); // Hey springboot, get an object from the LaptopLoose class!
		Laptop3 l2 = con.getBean(Laptop3.class);
		Laptop3 l3 = con.getBean(Laptop3.class);
		l1.turnOnLaptopLoose();
		l2.turnOnLaptopLoose();
	}

}

/*  As you see, in Springboot Object Creation is done Object Container and the application is created in another part.
 This is called "Inversion of Control" ==> "IOC"
   
   When you run the application, objects come from Object Container. Object Container is outside the application, 
   it means our application is getting sth from outside to inside, this is  "Injection".
   Because of that,  this process is called "Dependency Injection"*/
 