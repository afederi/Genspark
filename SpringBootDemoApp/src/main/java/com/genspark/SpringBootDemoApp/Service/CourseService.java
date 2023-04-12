package com.genspark.SpringBootDemoApp.Service;

import com.genspark.SpringBootDemoApp.Entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    Course getCourseById(int courseID);
    Course addCourse(Course c);
    Course updateCourse(Course co);
    String deleteCourseByID(int courseID);
}
