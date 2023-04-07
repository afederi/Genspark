package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {


    @Value("#{20}")
    private int x;

   @Value("#{3}")
    private int y;

   @Value("#{alien.x+alien.y}")//Would the "this" word work instead? NO. Also, make sure the first letter is lowercase because of the Component create a bean with lowercase
   //Is this a top-down kind of thing for values?
    private int z;

    @Value("#{T(org.example.Alien).hello(5.77)}")
    private double d;

    @Value("#{new java.lang.String('Genspark')}")
    private String name;

    @Value("#{'true'}")
    private boolean isActive;


    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setZ(int z){
        this.z=z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    //We don't require an object to be called when using a static method
    public static double hello(double a){
        return a;
    }


    @Override
    public String toString() {
        return "Alien{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", d=" + d +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
