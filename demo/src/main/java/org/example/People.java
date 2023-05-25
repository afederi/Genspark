package org.example;

import jakarta.persistence.Entity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



public class People {

    private String name;

    public People(){
        name = "";
    }
    public People(String name){
        this.name=name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
