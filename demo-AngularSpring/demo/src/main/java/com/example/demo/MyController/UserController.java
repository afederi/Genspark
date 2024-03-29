package com.example.demo.MyController;

import com.example.demo.DOA.UserRepository;
import com.example.demo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private final UserRepository userRepository;


    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return (List<User>) userRepository.findAll();
    }
    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

}
