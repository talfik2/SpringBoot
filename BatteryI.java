package com.techproed.springboot_demo2;

public interface BatteryI {
	
	public void use(); // This is abstract
	
	// When you use “default” keyword, you can put body inside your interface.
	public default void use(BatteryA bA) { // Use BatteryA as parameter
		System.out.println("BatteryA is used");
	}
	
	public default void use(BatteryB bB) { // Use BatteryB as parameter
		System.out.println("BatteryB is used");
	}

}
