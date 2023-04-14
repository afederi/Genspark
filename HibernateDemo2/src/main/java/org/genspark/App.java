package org.genspark;

import org.hibernate.query.Query;
import org.genspark.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();

        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Query q = session.createQuery("update Student set name=:n where id=:i");
        q.setParameter("n","Steve Jobs");
        q.setParameter("i",1);
        int status = q.executeUpdate();
        System.out.println(status);


        Query query = session.createQuery("from Student");
        List<Student> empList = query.list();

        for(Student emp: empList){
            System.out.println(emp.toString());
        }


        tx.commit();
        session.close();
        factory.close();
    }
}
