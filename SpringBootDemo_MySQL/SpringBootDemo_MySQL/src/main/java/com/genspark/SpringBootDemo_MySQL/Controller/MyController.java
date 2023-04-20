package com.genspark.SpringBootDemo_MySQL.Controller;

import com.genspark.SpringBootDemo_MySQL.Service.CourseService;
import com.genspark.SpringBootDemo_MySQL.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String home(){return "<HTML><H1>Welcome to Course Application</H1></HTML>";}

    @GetMapping("/courses")
    public List<Course> getCourses(){return this.courseService.getAllCourse();}

    @GetMapping("/courses/{courseID}")
    public Course getCourse(@PathVariable String courseID){
        return this.courseService.getCourseById(Integer.parseInt(courseID));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseID}")
    public String deleteCourse(@PathVariable String courseID){
        return this.courseService.deleteCourseById(Integer.parseInt(courseID));
    }
}
