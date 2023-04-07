package org.genspark;

import org.springframework.stereotype.Component;

@Component//Creating a bean for the Alien class
public class Alien {
    public void show(){
        /**
         * The comments here are example of cross-cutting concerns
         **/

        //2-3 lines of code for Log
        //2-3 lines for Transaction
        //2-3 lines for Security


        // 10 -15 lines of code for Business Logic
        System.out.println("Hello World!");
        //2-3 lines of code for closing Log
        //2-3 lines of code tp Commit Transaction
        //2-3 lines of code to disable security
    }
}
