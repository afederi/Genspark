import { Injectable } from '@angular/core';
import {PROJECTS} from '../mock-projects'
import {Projects} from '../Projects'

@Injectable({
  providedIn: 'root'
})
export class ProjectService {

  constructor() { }

  getProject(){
    return PROJECTS;
  }
}
