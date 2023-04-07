package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.SocketOption;
import java.net.SocketTimeoutException;


public class Tyre {
    public String brand;
    public int size;

    /**
     * This is for the Constructor Injection
     */
//    public Tyre(){
//
//    }
//
//    public Tyre(String brand, int size){
//        this.brand = brand;
//        this.size = size;
//
//   }

    /**
     * This is for Setter Injection
     *
     */
    public void setBrand(String brand) {
        System.out.println("Value is getting set to a Brand");
        this.brand = brand;
    }

    public void setSize(int size) {
        System.out.println("Value is getting set to Size");
        this.size = size;
    }



    @Override
    public String toString() {
        return "Tyre{" +
                "brand='" + this.brand + '\'' +
                ", size=" + this.size +
                '}';
    }

}
