package com.genspark.userservice.controller;


import com.genspark.userservice.VO.ResponseTemplateVO;
import com.genspark.userservice.entity.User;
import com.genspark.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        System.out.println("This is the user" + user);

        log.info("Inside the saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside the get UserWithDepartment of User Controller");
        return userService.getUserWithDepartment(userId);
    }


}
