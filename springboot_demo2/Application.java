package com.techproed.springboot_demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext con = SpringApplication.run(Application.class, args);
        Laptop l1 = con.getBean(Laptop.class);
        BatteryA bA = con.getBean(BatteryA.class);
        l1.use(bA);

        Laptop l2 = con.getBean(Laptop.class);
        BatteryB bB = con.getBean(BatteryB.class);
        l2.use(bB);

        con.close();
    }

}
