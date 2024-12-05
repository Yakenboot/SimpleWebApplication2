package com.example.simplewebapplication2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@SpringBootApplication
@RestController
public class SimpleWebService2Controller {
    public static void main(String[] args) {
        SpringApplication.run(SimpleWebService2Controller.class, args);
         //Scanner sc = new Scanner(System.in);
//System.out.println("Enter your name: ");
      // String name = sc.next();
    }
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
       // Scanner sc = new Scanner(System.in);
       // System.out.println("Enter your name: ");
       // name = sc.next();
        return "Hello " + name;
    }
}


