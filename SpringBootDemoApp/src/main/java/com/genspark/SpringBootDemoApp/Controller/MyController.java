package com.genspark.SpringBootDemoApp.Controller;

import com.genspark.SpringBootDemoApp.Entity.Course;
import com.genspark.SpringBootDemoApp.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {


//    @GetMapping("/")// a normal "/" will go to the normal http
//    public String home(){
//        return "<HTML><H1>Welcome to My First Boot Application</H1></HTML>";
//    }

    @Autowired
    private CourseService courseService;

    @RequestMapping("/home")
    public String home(@RequestParam( value="name", defaultValue="World") String name, @RequestParam( value="message", defaultValue="Good Morning")String message){//The @RequestParam is requesting the parameters from the url
        //We are passing the parameter value through the url
        return "Hello "+name +" "+message;  //url/Home?name="value"&message="value"
    }

    @GetMapping("/")// a normal "/" will go to the normal http
    public String home(){
        return "<HTML><H1>Welcome to Course Application</H1></HTML>";
    }

    @GetMapping("/courses")
    public List<Course> getCourse(){
        return this.courseService.getAllCourses();
    }

    @GetMapping("/courses/{courseID}")//When you call the url, if it matches the one in the method, then the method is called
    public Course getCourseID(@PathVariable String courseID){

        return this.courseService.getCourseById(Integer.parseInt(courseID));

    }

    /**
     *
     * @param course
     * @return
     *
     * This will use the Post state of the Url to call the method addCourse which will add a course to the list.
     * In this case, we are going to the body and adding the values in JSON format to add it to the list
     */
    @PostMapping("/courses")//Here we are using the post of the url localhost/courses to call the addCourse method
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseID}")
    public String deleteCourse(@PathVariable String courseID){
        return this.courseService.deleteCourseByID(Integer.parseInt(courseID));
    }





}
