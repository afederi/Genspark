package org.assignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


public class student {
    private int id;
    private String name;


    private List<Phone> ph;

    private Address add;


    public student(){

    }

    public student(int id, String name, List<Phone> ph, Address add) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.add = add;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }


    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ",\n ph=" + ph +
                ",\n add=" + add +
                '}';
    }
}
