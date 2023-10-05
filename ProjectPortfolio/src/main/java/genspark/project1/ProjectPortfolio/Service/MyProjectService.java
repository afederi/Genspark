package genspark.project1.ProjectPortfolio.Service;

import genspark.project1.ProjectPortfolio.Dao.ProjectRepository;
import genspark.project1.ProjectPortfolio.Entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyProjectService implements ProjectService{
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> getAllProjects() {
        return null;
    }

    @Override
    public List<Project> getAllProjectsByUser() {
        return null;
    }

    @Override
    public List<Project> getAllProjectsBySkill() {
        return null;
    }

    @Override
    public List<Project> getAllProjectsByName() {
        return null;
    }
}
