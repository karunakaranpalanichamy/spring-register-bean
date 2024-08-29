package com.examples.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @PostConstruct
//    public void initialize(){
//        this.name = "Dodge";
//    }
//    @PostConstruct
//    public void printHello(){
//        System.out.println("Hello from Vehicle....");
//    }
//
//
//    @PostConstruct
//    public void printGoodMorning(){
//        System.out.println("Good Morning from Vehicle....");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Destroying the beans....");
//    }
}
