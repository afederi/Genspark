package com.genspark.SpringBootSecurity.controller;

import com.genspark.SpringBootSecurity.entity.User;
import com.genspark.SpringBootSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class MyController {

    @Autowired
    private UserService userService;



    @GetMapping("")
    public String home(){return "<HTML><H1>Hello World</H1></HTML>";}

    @GetMapping("/public")
    public String publicUser(){return"<HTML><H1>I am a public user</H1></HTML>";}

    @PostMapping("/public")
    public User addPublicUser(@RequestBody User user){
        return this.userService.addUser(user);
    }

    @GetMapping("/normal")
    public String normalUser(){return "<HTML><H1>I am a normal user";}


    @GetMapping("/admin")
    public String adminUser(){return "<HTML><H1> I am a admin user</H1></HTML>";}

    /**A post mapping to add new users with passwords in admin**/
    @PostMapping("/admin")
    public User addUser(@RequestBody User user){
//        user.setPassword( passwordEncoder().encode(user.getPassword()) );
        return this.userService.addUser(user);
    }

    @DeleteMapping("/admin/{userID}")
    public String deleteUser(@PathVariable int userID){
        return this.userService.deleteUserByUserName(userID);
    }

}
