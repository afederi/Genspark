package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


/**
 * When developing enterprise code, it is best not to make changes in the source code, so that is why we
 * are using frameworks to outsource the changes
 **/

@Component
public class App {
    public static void main(String[]args){

        /**Tight coupling -- Not a good practice when coding
         * This is due to having the main method depend on creating the Car and bike classes
         * The main class is hard coding instances of Car and Bike
         **/
//        Car obj = new Car();
//        obj.drive();
//        Bike obj2 = new Bike();
//        obj2.drive();

        /**
         * A bit better than the code above that creates car and bike instances
         * In the code below, you have a Vehicle object that is an interface for both Bike and car
         * If you had to change the code,the 'new Bike()/Car()' side will change instead of both the
         * 'Vehicle obj' and 'new Bike()/Car()'.
         * This is better code, but the method still has to change the source code for 'new Bike()/Car()'
         * Still tight coupling
         */
//        Vehicle obj = new Bike();
//        obj.drive();

        /**
         * XML Configuration file
         *
         **/
        //BeanFactory -> good for small enterprise applications
        //Application
//        ApplicationContext context = new ClassPathXmlApplicationContext("SpringTest.xml");//Make sure to pass the xml file or it will not run

        //AbstractApplicationContext has to be used if you want to use the close method which will invoke the destroy method
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringTest.xml");//Make sure to pass the xml file or it will not run

        /**
         * Example of Dependency Injection - the app program is declaring the obj of type Vehicle,
         * and we are calling context.getBean to provide us with a value to store in obj
         **/


        //The myCar name is a custom name for the class you are calling Car
        Vehicle obj = (Vehicle) context.getBean("myCar");
        obj.drive();

        context.close();

    }
}
