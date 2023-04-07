package org.assignment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;



public class student {
    @Value("#{11}")
    private int id;


    @Value("#{'Larry Fanta'}")
    private String name;
//

    @Autowired
    @Qualifier("getPhone")//This is necessary or ph will be null
    private List<Phone> ph;
//
    @Autowired//Using the primary annotation so getAddress is the one injecting address
    private Address add;


    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ",\nph=" + ph +
                ",\nadd=" + add +
                '}';
    }
}
