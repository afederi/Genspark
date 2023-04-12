package com.genspark.Controller;

import com.genspark.Entity.Course;
import com.genspark.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getAllCourse();
    }
    @RequestMapping("/home")
    public String home(@RequestParam( value="name", defaultValue="World") String name, @RequestParam( value="message", defaultValue="Good Morning")String message) {//The @RequestParam is requesting the parameters from the url
        //We are passing the parameter value through the url
        return "Hello " + name + " " + message;  //url/Home?name="value"&message="value"
    }

    @GetMapping("/courses/{courseID}")
    public Course getCourse(@PathVariable String courseID){
        return this.courseService.getCourseById(Integer.parseInt(courseID));
    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    @DeleteMapping("/courses/{courseID}")
    public String deleteCourse(@PathVariable String courseID){
        return this.courseService.deleteCourseById(Integer.parseInt(courseID));
    }
}
