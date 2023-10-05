package genspark.project1.ProjectPortfolio.Controller;

import genspark.project1.ProjectPortfolio.Entity.Project;
import genspark.project1.ProjectPortfolio.Service.MyProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
//CrossOrigin(origins = "http://localhost:4200")
public class myController {

    @Autowired
    private MyProjectService myProjectService;

    @GetMapping("/")
    public String home(){return "HELLO WORLD";}
    @GetMapping("/project")
    public List<Project> getProjects(){
        return (List<Project>) myProjectService.getAllProjects();
    }


}
