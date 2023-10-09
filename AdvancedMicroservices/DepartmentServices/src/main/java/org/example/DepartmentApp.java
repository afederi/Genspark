package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */

@ComponentScan
@SpringBootApplication
public class DepartmentApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(DepartmentApp.class,args);
    }
}
