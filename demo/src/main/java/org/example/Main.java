package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Chess c = new King();

        //c.setLocation("A5");
        System.out.println(c.getLocation());

        ChessAbstract p = new pawn();
        System.out.println(p.location);
    }
}