package org.genspark;

import org.genspark.Entity.Employee;
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
        Transaction t = session.beginTransaction();

        //To add(CREATE) an element to the table
//        Employee e1 = new Employee();
//        e1.setEmpId(1);
//        e1.setEmpName("Not Steve");
//        e1.setEmpDept("HR Dept");
//        session.save(e1);



        //Query(READ) elements with specific attributes
//        Query query =session.createQuery("from Employee where empDept=:dept");
//        query.setParameter("dept", "Training Dept");
//        List<Employee> empList=query.list();


        //Query(UPDATE) a specific element to change its values
//        Query q = session.createQuery("update Employee set empName=:n where empId=:i");
//        q.setParameter("n", "Adam");
//        q.setParameter("i",1);
//        int status = q.executeUpdate();
//        System.out.println(status);



        //Query(READ) all elements into a list
        Query query = session.createQuery("from Employee");
        List<Employee> empList = query.list();

        for(Employee emp: empList){
            System.out.println(emp.toString());
        }

        t.commit();
        System.out.println("Retrieved Successfully");
        factory.close();
        session.close();



    }
}
