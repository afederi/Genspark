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
    this.projects = this.projectService.getProject();
  }
}
