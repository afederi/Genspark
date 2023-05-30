import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-button',
  templateUrl: './button.component.html',
  styleUrls: ['./button.component.css']
})
export class ButtonComponent implements OnInit {

  //These properties had to be initialized, but setting strict to false in the tsconfig.json file fixes that
  @Input() text: string;
  @Input() color: string;
  @Output() btnClick = new EventEmitter();

  constructor(){}
  ngOnInit(): void{}

  onClick(){
    this.btnClick.emit();
  }

}
