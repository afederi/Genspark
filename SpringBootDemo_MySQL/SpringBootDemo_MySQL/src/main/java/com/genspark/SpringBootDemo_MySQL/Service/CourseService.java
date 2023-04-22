package com.genspark.SpringBootDemo_MySQL.Service;

import com.genspark.SpringBootDemo_MySQL.entity.Course;
import org.springframework.context.annotation.Bean;

import java.util.List;


public interface
CourseService {
    public List<Course> getAllCourse();

    public Course getCourseById(int courseID);

    public Course addCourse(Course course);
    public String deleteCourseById(int courseID);
    public Course updateCourse(Course course);


}
