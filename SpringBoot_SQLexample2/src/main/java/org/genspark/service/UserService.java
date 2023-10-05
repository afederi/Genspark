package org.genspark.service;

import org.genspark.entity.User;
import org.genspark.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    public PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){return this.userRepository.findAll();}

    public User getUser(String username){return this.userRepository.findByusername(username);}

    public User getUserInfo(String username) {

        return this.userRepository.findByusername(username);
        /**
        List<User> list = this.userRepository.findAll();
        User userFound = null;


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(username)) {
                userFound = list.get(i);
            }
        }
        if (userFound == null) {
            throw new RuntimeException("Username not found for username ::" + username);
        }
        return userFound;
         **/
    }

    //Develop code so that usernames are unique to everyone
    public User addUser(User user){

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return this.userRepository.save(user);

    }


    public User updatePassword(User user){

        User userFound =null;


        List<User> list = this.userRepository.findAll();

        for(int i=0;i<list.size();i++){
            if(list.get(i).getUsername().equals(user.getUsername())){
                userFound=list.get(i);
            }
        }
        if(userFound==null){
            throw new RuntimeException("Username not found for username ::" + user.getUsername());
        }

        userFound.setPassword(user.getPassword());
        return this.userRepository.save(user);

    }

    public String deleteUser(User user){
        this.userRepository.delete(user);
        return "Delete Successfully";
    }

    public String deleteUserByUsername(String username){
        List<User> list = this.userRepository.findAll();
        User userFound =null;


        for(int i=0;i<list.size();i++){
            if(list.get(i).getUsername().equals(username)){
                userFound=list.get(i);
            }
        }
        if(userFound==null){
            throw new RuntimeException("Username not found for username ::" + username);
        }

        this.userRepository.delete(userFound);
        return "Delete Successfully";
    }





}
