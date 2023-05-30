import { Component , OnInit, Output, EventEmitter} from '@angular/core';
import {Projects} from '../Projects';
import {UiService} from '../services/ui.service';
import {Subscription} from 'rxjs';
@Component({
  selector: 'app-add-project',
  templateUrl: './add-project.component.html',
  styleUrls: ['./add-project.component.css']
})
export class AddProjectComponent implements OnInit{
  @Output() onAddProject: EventEmitter<Projects> = new EventEmitter();
  name: string;
  description: string;
  skills: string;
  showAddProject: boolean = true;
  subscription: Subscription;


  constructor(private uiService: UiService) {
    this.subscription = this.uiService.onToggle().subscribe((value)=> (this.showAddProject = value));
  }

  ngOnInit(): void{}

  onSubmit(){
    if(!this.name){
      alert('add the task');
      return;
    }

    const newTask = {


      name: this.name,
      description: this.description,
      skills: this.skills
    };

    this.onAddProject.emit(newTask);

    this.name = '';

    this.description = '';

    this.skills = '';
  }




}
