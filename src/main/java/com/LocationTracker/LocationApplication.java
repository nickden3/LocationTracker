package com.LocationTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.LocationTracker"})
@SpringBootApplication
public class LocationApplication {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(LocationApplication.class, args);
    }

}
