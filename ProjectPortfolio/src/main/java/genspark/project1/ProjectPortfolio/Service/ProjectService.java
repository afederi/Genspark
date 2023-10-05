package genspark.project1.ProjectPortfolio.Service;

import genspark.project1.ProjectPortfolio.Entity.Project;

import java.util.List;

public interface ProjectService {
    public List<Project> getAllProjects();

    public List<Project> getAllProjectsByUser();

    public List<Project> getAllProjectsBySkill();

    public List<Project> getAllProjectsByName();

}
