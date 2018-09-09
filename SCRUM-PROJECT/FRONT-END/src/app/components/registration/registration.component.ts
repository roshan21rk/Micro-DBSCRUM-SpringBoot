
import { Boys } from './../../model/boys-model';
import { BoysService } from './../../service/boys.service';
import { Component, OnInit } from '@angular/core';



@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css'],
  providers: [BoysService]
})
export class RegistrationComponent implements OnInit {

  constructor(private boysService:BoysService) { }

  ngOnInit() {
  }

}
