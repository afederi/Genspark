import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import {Projects} from '../Projects'
import {faTimes} from '@fortawesome/free-solid-svg-icons';
@Component({
  selector: 'app-task-item',
  templateUrl: './task-item.component.html',
  styleUrls: ['./task-item.component.css']
})
export class TaskItemComponent implements OnInit {
  @Input() project : Projects;
  @Output() onDeleteProject: EventEmitter<Projects> = new EventEmitter();
  faTimes = faTimes;

  constructor(){}
  ngOnInit(): void{}

  onDelete(project){
    console.log(project);
    this.onDeleteProject.emit(project);
  }

}
