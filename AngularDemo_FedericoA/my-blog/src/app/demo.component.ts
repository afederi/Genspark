import {Component} from "@angular/core";

@Component (
  {
    selector: 'demo-comp',
    template: `
      <h1> This is my manually created component </h1>
      <h1> Hello world {{name}}</h1>
    `
  }
)
export class demoCompon {
  name = "Genspark";

}
