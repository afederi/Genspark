import { Component , OnInit} from '@angular/core';

@Component({
  selector: 'app-testheader',
  templateUrl: './testheader.component.html',
  styleUrls: ['./testheader.component.css']
})
export class TestheaderComponent implements OnInit{
  title: string = 'angular_portfolio';

  constructor(){}

  ngOnInit():void{}

  toggleAddInfo(){
    //on 30:30 a brief flow of how a button click leads to a console.log output
    console.log('toggle');
  }

}
