package com.techproed.springboot_demo2;
// Battery is Parent Interface. When we use parent implementation, we shuld use Override method.

import org.springframework.stereotype.Component;

@Component // Don't forget to put Component
public class BatteryA implements BatteryI {
	
	public int price;
	
	BatteryA(){ // Putting the Constructor
		System.out.println("BatteryA is created...");
	}
	
	@Override
	public void use() {
		System.out.println("BatteryA is used...");
		
	}

}
