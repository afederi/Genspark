package com.genspark.SpringBootSecurityRevised.service;

import com.genspark.SpringBootSecurityRevised.entity.User;
import com.genspark.SpringBootSecurityRevised.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

//    public PasswordEncoder passwordEncoder(){return new BCryptPasswordEncoder();
//    }


    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){

//        user.setPassword(passwordEncoder().encode(user.getPassword()));
        return this.userRepository.save(user);
    }

}
