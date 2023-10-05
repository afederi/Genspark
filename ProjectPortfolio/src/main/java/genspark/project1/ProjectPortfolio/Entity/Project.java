package genspark.project1.ProjectPortfolio.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String project_name;
    private String description;
    private String skills;
    private String users;
    private String github_link;
    private String demo_website;





}
