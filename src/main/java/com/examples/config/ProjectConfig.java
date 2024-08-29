package com.examples.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.examples.bean")
public class ProjectConfig {

//    @Primary
//    @Bean(value = "toyotaVehicle")
//    Vehicle vehicle(){
//        var vehicle = new Vehicle();
//        vehicle.setName("Toyota");
//        return vehicle;
//    }
//    @Bean(value = "hondaVehicle")
//    Vehicle vehicle1(){
//        var vehicle = new Vehicle();
//        vehicle.setName("Honda");
//        return vehicle;
//    }

//    @Bean
//    String hello(){
//        return "hello world";
//    }
//
//    @Bean
//    Integer number(){
//        return 16;
//    }
//
//    @Bean
//    int num1(){
//        return 20;
//    }

    @Bean
    StringBuilder sb(){
        return new StringBuilder("hello");
    }
}
