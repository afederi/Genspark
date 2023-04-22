package org.genspark.controller;

import org.genspark.entity.User;
import org.genspark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home(){ return "<HTML><H1>Welcome to the User Portal</H1></HTML>";}

    @GetMapping("/normal")
    public String normal_home(){return "<HTML><H1>Welcome to the Normal Portal</H1></HTML>";}

    @GetMapping("/admin")
    public List<User> getUsers(){return this.userService.getAllUsers();}

    @GetMapping("/normal/{username}")
    public User getUserInfo_normal(@PathVariable String username){return this.userService.getUser(username);}

    @GetMapping("/admin/user/{username}")
    public User getUserInfo(@PathVariable String username) {
        return this.userService.getUserInfo(username);
    }


    @PostMapping("/admin")
    public User addUser(@RequestBody User user){return this.userService.addUser(user);}




}
