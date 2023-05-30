import { Component, OnInit } from '@angular/core';
import {ProjectService} from '../services/project.service'
//import {PROJECTS} from '../mock-projects' //This was originally used to import from the mock-projects file, but now we are using a service to do this
import {Projects} from '../Projects'

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrls: ['./projects.component.css']
})
export class ProjectsComponent implements OnInit {

  projects: Projects[] = [];
  constructor(private projectService: ProjectService){}


  ngOnInit(): void{
    /**This is done for the file fest
    this.projects = this.projectService.getProject();
    **/

    this.projectService.getProject().subscribe((Projects)=> this.projects = Projects);
  }

  deleteProject(project: Projects){
    this.projectService.deleteTask(project).subscribe(()=> (this.projects = this.projects.filter((p) => p.id !== project.id)));
  }

  addProject(project: Projects){
    this.projectService.addProject(project).subscribe((project) => this.projects.push(project));
  }

}
