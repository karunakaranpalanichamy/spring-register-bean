package com.examples.main;

import com.examples.bean.Vehicle;
import com.examples.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//        vehicle.setName("Honda City");
//        System.out.println("vehicle name from non-spring context is:"+vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        try {
            Vehicle veh = context.getBean(Vehicle.class);
            System.out.println("Vehicle name from Spring Context is:" + veh.getName());
        } catch(Exception e1) {
            System.out.println("Exception occurred....");
        }

        System.out.println("AFter exception is handled....");
        Scanner in = new Scanner(System.in);
        System.out.print("DO you want to purchase a car: ");
        String consent = in.nextLine();
        if("yes".equalsIgnoreCase(consent)) {
            context.registerBean("vehicle",Vehicle.class,() -> {
                Vehicle vehicle = new Vehicle();
                vehicle.setName("Ford");
                return vehicle;
            });
            Vehicle veh = context.getBean(Vehicle.class);
            System.out.println("Registered vehicle name is:"+veh.getName());
        } else{
            System.out.println("Thank you.. Vehicle bean not created...");
        }

     //   veh.printHello();

//        StringBuilder sb = context.getBean(StringBuilder.class);
//        System.out.println("sb is:"+sb);

    }
}
