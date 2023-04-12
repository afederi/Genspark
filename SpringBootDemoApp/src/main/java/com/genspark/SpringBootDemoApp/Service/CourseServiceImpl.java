package com.genspark.SpringBootDemoApp.Service;

import com.genspark.SpringBootDemoApp.Entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;


    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(101,"Spring Framework", "Pradeep"));
        list.add(new Course(102,"Spring Boot", "Sukvider"));
        list.add(new Course(103,"Web Application","Adam"));

    }

    @Override
    public List<Course> getAllCourses() {
        return list;
    }

    @Override
    public Course getCourseById(int courseID) {
        Course c = null;

        for(Course g : list){
            if(g.getCourseid()==courseID){
                c=g;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course c) {
        list.add(c);
        return c;
    }

    @Override
    public Course updateCourse(Course co) {
        String title = co.getTitle();
        String instructor = co.getInstructor();
        Course c = null;

        for(Course g:list){
            if(g.getCourseid()==co.getCourseid()){
                g.setTitle(title);
                g.setInstructor(instructor);
                c=g;
            }
        }
        return c;
    }

    @Override
    public String deleteCourseByID(int courseID) {

        for(Course g:list){
            if(g.getCourseid()==courseID){
                list.remove(g);
                break;
            }
        }
        return "Deleted Successfully";
    }
}
