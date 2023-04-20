package org.example;

public interface Chess {
    String location="7";

    public void move();

    public String getLocation();

    public void setLocation(String location);

    public void isLost();
}
