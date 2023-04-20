package org.example;

public abstract class ChessAbstract {
    String location = "7A";

    public abstract void move();

    public abstract String getLocation();

    public abstract void setLocation(String location);

    public abstract void isLost();
}
