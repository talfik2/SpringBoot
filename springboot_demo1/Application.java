package com.techproed.springboot_demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext con = SpringApplication.run(Application.class, args);
        Laptop l1 = con.getBean(Laptop.class);
        Laptop l2 = con.getBean(Laptop.class);

        l1.turnOnLaptop();
        l2.turnOnLaptop();
    }

}
