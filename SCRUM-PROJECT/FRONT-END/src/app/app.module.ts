import { BoysService } from './service/boys.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { ToastrModule } from 'ngx-toastr';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes}  from '@angular/router';



import { AppComponent } from './app.component';
import { RegistrationComponent } from './components/registration/registration.component';
import { BoysComponent } from './components/boys/boys.component';
import { BoysListComponent } from './components/boys-list/boys-list.component';
import { UpdateBoysdataComponent } from './Components/update-boysdata/update-boysdata.component';

const appRoutes : Routes=[
  { path: '', component: RegistrationComponent},
  { path: 'List', component: BoysListComponent },

  { path: 'updateData/:id', component:UpdateBoysdataComponent}

]

@NgModule({
  declarations: [
    AppComponent,
    RegistrationComponent,
    BoysComponent,
    BoysListComponent,
    UpdateBoysdataComponent
  ],
  imports: [
    BrowserModule, 
    FormsModule,
    HttpModule,
    RouterModule.forRoot(appRoutes),
   
    BrowserAnimationsModule,
    ToastrModule.forRoot()
  ],
  providers: [BoysService],
  bootstrap: [AppComponent]
})
export class AppModule { }
