package org.genspark;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component//Create a bean for the Helper class
@Aspect//Indicates that this class is an aspect class which will address the cross-cutting concerns
@EnableAspectJAutoProxy//This has to be called in order for the Aspect function to work in this class

// We need an Advice -> What method to be called
// Pointcut -> Where the method to be called


public class Helper {
    /**
     * All the cross-cutting concerns are here
     */

    @Before("execution(public void show())")
    public void logOpen(){
        System.out.println("Log Begin...");
    }

    @After("execution(public void show())")
    public void logClos(){
        System.out.println("Log Stop...");
    }
}
