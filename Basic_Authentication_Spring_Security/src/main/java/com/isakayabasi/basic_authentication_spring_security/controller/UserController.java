package com.isakayabasi.basic_authentication_spring_security.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/admin")
    public String admin(){
        return "special message for admin!";
    }

    @GetMapping("/index")
    public String index(){
        return "Index Page,Welcome";
    }

    @GetMapping("/dashboard")
    public String dashboard(){
        return "Login successful at dashboard page";

    }
}