package com.example.demojsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;



@SpringBootApplication
@ImportResource(value="classpath:aass.xml")
public class DemojspApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemojspApplication.class, args);
    }

}
