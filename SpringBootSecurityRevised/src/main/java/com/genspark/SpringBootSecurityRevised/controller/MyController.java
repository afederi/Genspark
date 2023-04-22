package com.genspark.SpringBootSecurityRevised.controller;
import com.genspark.SpringBootSecurityRevised.entity.User;


import com.genspark.SpringBootSecurityRevised.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController()
public class MyController {


    @Autowired
    private UserService userService;

    @GetMapping("/home")
    public String home(){
        return "This is Home Page";
    }

    @GetMapping("/normal")
    public String normalUser(){return "<HTML><H1>I am a normal user</H1></HTML>";}

    @GetMapping("/admin")
    public String admin(){
        return "This is Admin Page";
    }


    @PostMapping("/public")
    public User addPublicUser(@RequestBody User user){
        return this.userService.addUser(user);
    }

}
