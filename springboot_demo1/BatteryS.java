package com.techproed.springboot_demo1;

import org.springframework.stereotype.Component;

@Component("bS") // To use @Qualifier("bS"), we need to change @Component with Component("bS")
public class BatteryS {
	private String name;
	private int duration;
	
	BatteryS(){
		System.out.println("BatteryS is Created...");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
		
	}
	
	public void use() {
		
		System.out.println("BatteryS is used...");
		// Go to laptop class...
	}
}
