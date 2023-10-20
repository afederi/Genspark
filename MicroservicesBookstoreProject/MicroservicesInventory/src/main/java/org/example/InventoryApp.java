package org.example;

import org.example.Entity.User;
import org.example.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Random;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class InventoryApp implements CommandLineRunner
{

    @Autowired
    private UserRepository userRepository;

    Random random = new Random();

    public void createUsers(){
        User user = new User();
        Long id = user.getUserId();
        user.setUserId(id);
        user.setEmail("user"+id+"@gmail.com");
        user.setPassword("user"+id);
        user.setEnabled(true);
        user.setRole("ADMIN");
        user.setUsername("user"+id);
        User save = this.userRepository.save(user);

        System.out.println(save);

    }

    @Override
    public void run(String... args) throws Exception {
        createUsers();
    }

    public static void main(String[] args )
    {
        SpringApplication.run(InventoryApp.class, args );
    }
}
