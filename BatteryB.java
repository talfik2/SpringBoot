package com.techproed.springboot_demo2;
//Battery is Parent Interface. When we use parent implementation, we shuld use Override method.

import org.springframework.stereotype.Component;

@Component // Don't forget to put Component
public class BatteryB implements BatteryI{

	public int price;
	
	BatteryB(){ // Putting the Constructor
		System.out.println("BatteryA is created...");
	}
	
	@Override
	public void use() {
		System.out.println("BatteryB is used");
		
	}

}
