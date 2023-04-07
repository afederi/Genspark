package org.assignment2;

import org.springframework.stereotype.Component;
@Component//The Component anotation is running because there is a default constructor present
public class Phone {
    private String mob;
    public Phone(String mob){
        this.mob=mob;
    }
    public Phone(){}

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}
