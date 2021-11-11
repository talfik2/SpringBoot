package com.techproed.springboot_demo1;

public class Laptop {
/* Lets create two variables: Battery(b is my battery object and price*/
	private Battery b;
	private int price;
	
	/* Creating the Laptop Constructor*/
	Laptop(){
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
	
	public void turnOnLaptop() {
		System.out.println("Laptop is turned on...");
	} /* Continue with the SpringbootDemoApplication.java */ 
}
