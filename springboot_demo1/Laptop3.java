package com.techproed.springboot_demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
// If you don't put Component on the top, springboot framework cannot create bean from the given class(for our case LaptopLoose) 
// even if you don't create any object, as you put Component on the top, springboot will create one automatically for you.

public class Laptop3 {
/* Lets create two variables: Battery(b is my battery object and price*/
	private Battery b;
	private int price;
	// Let's put one more variable. We need to create getters and setters for BatteryS also..	 
	@Autowired // to remind Laptop3 that BatteryS is one of the dependents of it.
	@Qualifier("bS") // select the bS by it's name. It is used by @Autowired together.
	private BatteryS bS;
	
	/* Creating the Laptop Constructor*/
	Laptop3(){
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
	
	public BatteryS getbS() {
		return bS;
	}
	public void setbS(BatteryS bS) {
		this.bS = bS;
	}
	public void turnOnLaptopLoose() {
		bS.use();
		System.out.println("Laptop is turned on...");
	} /* Continue with the SpringbootDemoApplication.java */ 
}
