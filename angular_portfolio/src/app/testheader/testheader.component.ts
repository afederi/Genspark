import { Component , OnInit} from '@angular/core';
import {UiService} from '../services/ui.service';
import {Subscription} from 'rxjs';
@Component({
  selector: 'app-testheader',
  templateUrl: './testheader.component.html',
  styleUrls: ['./testheader.component.css']
})
export class TestheaderComponent implements OnInit{
  title: string = 'angular_portfolio';
  showAddProject: boolean = true;
  subscription: Subscription

  constructor(private uiService: UiService){
    this.subscription = this.uiService.onToggle().subscribe(value => this.showAddProject = value);
  }


  ngOnInit():void{}

  toggleAddProject(){
    //on 30:30 a brief flow of how a button click leads to a console.log output
    this.uiService.toggleAddProject();
  }

}
