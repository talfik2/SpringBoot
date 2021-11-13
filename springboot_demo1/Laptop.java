package com.techproed.springboot_demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
//@Scope("prototype")
public class Laptop {
    private Battery b;
    private int price;
    @Autowired
    @Qualifier("bS")
    private BatteryS bS;
    Laptop() {
        System.out.println("Laptop is created...");
    }

    // Getter and Setter
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

    public void turnOnLaptop() {
        bS.use();
        System.out.println("Laptop is turned on...");
    }
}
