package genspark.project1.ProjectPortfolio.Dao;

import genspark.project1.ProjectPortfolio.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
