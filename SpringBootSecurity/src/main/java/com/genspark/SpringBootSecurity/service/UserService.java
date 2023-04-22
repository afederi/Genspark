package com.genspark.SpringBootSecurity.service;

import com.genspark.SpringBootSecurity.entity.User;
import com.genspark.SpringBootSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return this.userRepository.save(user);
    }

    public String deleteUserByUserName(int userID) {

        this.userRepository.deleteById(userID);
        return "Deleted Successfully";
    }
}
