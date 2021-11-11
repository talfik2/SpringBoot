package com.techproed.springboot_demo2;
//Battery is Parent Interface. When we use parent implementation, we shuld use Override method.
public class BatteryB implements BatteryI{

	public int price;
	
	BatteryB(){ // Putting the Constructor
		System.out.println("BatteryA is created...");
	}
	
	public void use() {
		System.out.println("BatteryB is used");
		
	}

}
