package org.assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[]args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        /**
         * Can  get a bean in three ways:
         *      in the AppConfig(getStudent);
         *      call the actual class if the @Component turns the class into a bean
         *      students.class if the @Component is not present
         **/
        //Can  get a bean in three ways: in the AppConfig(getStudent); call the actual class since the @component turns
        student s = (student) context.getBean(student.class);
        System.out.println(s.toString());
    }
}
