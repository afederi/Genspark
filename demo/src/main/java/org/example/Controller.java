package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

//@RestController
//public class Controller {
//    @Autowired
//    private PeopleRepository peopleRepository;
//
//    @GetMapping("/")
//    public String homePage() {
//        return "<HTML><H1> Hello World </H1></HTML>";
//    }
//    @GetMapping("/name")
//    public People showList() {
//        return this.peopleRepository.findAll();
//    }
//
//    @GetMapping("/name/{name}")
//    public People showPerson(@PathVariable("name") String p){
//        return this.peopleRepository.findByName(p);
//    }
//
//    @PostMapping("/name")
//    public People addPerson(@RequestBody People p) {
//        return this.peopleRepository.save(p);
//    }
//
//    @PutMapping("/name")
//    public People updatePerson(@RequestBody People p) {
//        List<People> list = this.peopleRepository.findAll();
//        People person = null;
//
//        for(int i=0;i<list.size();i++){
//            if(list.get(i).getName().equals(p.getName())){
//                person = list.get(i);
//            }
//        }
//        if(person==null){
//            throw new RuntimeException(" Person not found ");
//        }
//
//        person.setName(p.getName());
//        return this.peopleRepository.save(p);
//    }
//    @DeleteMapping("/name")
//    public People deletePerson(@RequestBody People p) {
//        return this.peopleRepository.delete(p);
//    }
//}


@RestController
public class Controller {


    People people;//Contains one variable called name


    @GetMapping("/")
    public String homePage() {
        return "<HTML><H1> Hello World </H1></HTML>";
    }

    @GetMapping("/name")
    public String showList() {
        return this.people.getName();
    }


    @PostMapping("/name")
    public People addPerson(@RequestBody People p) {
        if(people==null) {
            this.people = p;
            return this.people;
        }
        return this.people;
    }

    @PutMapping("/name")
    public People updatePerson(@RequestBody People p) {
        this.people.setName(p.getName());
        return this.people;
    }


    @DeleteMapping("/name")
    public People deletePerson(@RequestBody People p) {
        if(p.getName().equals(this.people.getName())){
            this.people = null;
        }
        return this.people;
    }
}

/**
@RestController
public class Controller {

    @Autowired
    private SimpleService simpleService;

    @GetMapping("/")
    public String homePage() {
        return "<HTML><H1> Hello World </H1></HTML>";
    }

    @GetMappring("/list")
    public List<People> showList() {
        return this.simpleService.getAllPeople();
    }

    @GetMappring("/list/{name}")
    public List<People> showPerson(@RequestVariable(value="name") String p) {
        return this.simpleService.getPerson(p);
    }

    @PostMapping("/list")
    public People addPerson(@RequestBody People p) {
        return this.simpleService.addPerson(p);
    }

    @PutMapping("/list")
    public People updatePerson(@RequestBody People p) {
        return this.simpleService.updatePerson(p);
    }

    @DeleteMapping("/list")
    public People deletePerson(@RequestBody People p) {
        return this.simpleService.deletePerson(p);
    }
}
**/