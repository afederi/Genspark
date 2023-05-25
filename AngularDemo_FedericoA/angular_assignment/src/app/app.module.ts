import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { FormComponentComponent} from './form-component/form-component.component';
import { FooterComponent } from './footerComponent/footer.component';
import { NavComponent} from './nav-container/nav.component';

@NgModule({
  declarations: [
    AppComponent,
    FormComponentComponent,
    NavComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
