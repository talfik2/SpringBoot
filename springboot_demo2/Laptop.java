package com.techproed.springboot_demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	BatteryI b;
	@Autowired
	// Let's specify which battery method that I want to use
	private BatteryA bA;
	
	Laptop(){
		
		System.out.println("Laptop is created...");
	}
	
	public void use() {
		bA.use();
		//b.use();
	}
	// Lets create turnonLaptop() method
	public void turnOnLaptop() {
		System.out.println("Laptop is turned on...");
	}
}
