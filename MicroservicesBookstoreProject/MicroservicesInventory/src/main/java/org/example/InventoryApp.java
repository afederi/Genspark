package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class InventoryApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(InventoryApp.class, args );
    }
}
