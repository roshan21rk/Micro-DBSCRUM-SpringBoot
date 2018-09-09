import { Response } from '@angular/http';
import { Boys } from './../../model/boys-model';
import { Component, OnInit } from '@angular/core';
import { BoysService } from '../../service/boys.service';
import { NgForm } from '@angular/forms';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';


@Component({
  selector: 'app-boys',
  templateUrl: './boys.component.html',
  styleUrls: ['./boys.component.css']
})
export class BoysComponent implements OnInit {

  private boysList: Boys[];

  private boy=new Boys();
  constructor(private boysService: BoysService, private toastr: ToastrService,private route : Router) {

  }
  ngOnInit() {
    this.onReset();
    
  }
  onReset(form?: NgForm) {
    if (form != null)
      form.reset();
    this.boysService.selectedBoy = {
      id: null,
      firstname: '',
      lastname: '',
      city: '',
      phone: '',
      age: null,
      profession: '',
      status: ''
    }

  }
  onSubmit(form:NgForm) {
   this.boysService.postBoys(form.value)
   .subscribe(data=>{
     this.onReset(form);
   })

    this.toastr.success("Record Added Successfully")
    
   


}
}
