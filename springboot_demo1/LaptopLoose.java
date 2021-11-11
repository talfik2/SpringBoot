package com.techproed.springboot_demo1;

import org.springframework.stereotype.Component;

@Component
// If you don't put Component on the top, springboot framework cannot create bean from the given class(for our case LaptopLoose) 
// even if you don't create any object, as you put Component on the top, springboot will create one automatically for you.
// Every time @Scope("prototype") works, SpringBoot stops creating object inside the creator. Thus, we don't use it with Singleton
public class LaptopLoose {
/* Lets create two variables: Battery(b is my battery object and price*/
	private Battery b;
	private int price;
	
	/* Creating the Laptop Constructor*/
	LaptopLoose(){
		System.out.println("Laptop is created...");
	}
/* When we create private variables, we create getters and seters*/
/* Otherwise we cannot read and update the values of the variables from other classes since we made them private */
/* Creating Getters and Setters */ 
	public Battery getB() {
		return b;
	}
	public void setB(Battery b) {
		this.b = b;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void turnOnLaptopLoose() {
		System.out.println("Laptop is turned on...");
	} /* Continue with the SpringbootDemoApplication.java */ 
}
