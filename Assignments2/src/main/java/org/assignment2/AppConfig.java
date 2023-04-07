package org.assignment2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "org.assignment2")
public class AppConfig {

    @Bean//Creating a bean for student in the app config
    public student getStudent(){
        return new student();
    }

    //What if I want to make a list of multiple student with different values

    @Bean
    @Primary
    public Address getAddress(){
        Address add = new Address();
        add.setCity("Atlanta");
        add.setState("GA");
        add.setCountry("US");
        add.setZipcode("30060");
        return add;
    }
    @Bean
    public List<Phone> getPhone(){
        List<Phone> ph = new ArrayList<>();
        ph.add(new Phone("6789998212"));
        ph.add(new Phone("4041234567"));
        ph.add(new Phone("1234567890"));

        return ph;

    }




    //Testing out autowire for id in the student class
//    @Bean
//    public int getid(){
//        return 7;
//    }
//    @Bean//Multiple beans that return the same type means that
//    //you need a primary/qualifier to specify which bean to inject
//    public int hello(){
//        return 11;
//    }



}
