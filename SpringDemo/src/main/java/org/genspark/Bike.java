package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
    @Autowired
    public Tyre ty;
//    public Bike(Tyre ty){
//        this.ty=ty;
//    }


    public void setTy(Tyre ty) {
        this.ty = ty;
    }

    public void drive() {
        System.out.println("I am riding bike..."+ty.toString());
    }
}
