import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {RouterModule, Routes} from '@angular/router'


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TestheaderComponent } from './testheader/testheader.component';
import { ButtonComponent } from './button/button.component';
import { ProjectsComponent } from './projects/projects.component';
import { TaskItemComponent } from './task-item/task-item.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';
import {AddProjectComponent} from './add-project/add-project.component';

const appRoutes: Routes=[
  {path: '', component: ProjectsComponent}
];
@NgModule({
  declarations: [
    AppComponent,
    TestheaderComponent,
    ButtonComponent,
    ProjectsComponent,
    TaskItemComponent,
    AddProjectComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FontAwesomeModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(appRoutes, {enableTracing: true})
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
