import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http'
import {Observable} from 'rxjs';
//import {PROJECTS} from '../mock-projects'
import {Projects} from '../Projects'

const httpOptions ={
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
  }),
};

@Injectable({
  providedIn: 'root'
})
export class ProjectService {
  private apiUrl = 'http://localhost:5000/projects'

  constructor(private http:HttpClient) {

  }

/** This is for festching from a file
  getProject(): Projects[]{
    return PROJECTS;
  }
  **/
  /**
  getProject(): Observable<Projects[]>{
    const projects = of(PROJECTS);
    return projects
  }
  **/

  getProject(): Observable<Projects[]>{
    return this.http.get<Projects[]>(this.apiUrl);
  }
  deleteTask(project: Projects): Observable<Projects>{

    const url = `${this.apiUrl}/${project.id}`;
    return this.http.delete<Projects>(url);
  }
  addProject(project: Projects): Observable<Projects>{
    return this.http.post<Projects>(this.apiUrl, project, httpOptions);
  }
}
