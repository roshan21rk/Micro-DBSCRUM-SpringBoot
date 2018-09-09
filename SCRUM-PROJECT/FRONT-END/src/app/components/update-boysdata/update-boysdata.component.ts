import { Response } from '@angular/http';
import { Boys } from './../../model/boys-model';
import { Component, OnInit } from '@angular/core';
import { BoysService } from '../../service/boys.service';
import { NgForm } from '@angular/forms';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';
import { ActivatedRoute } from '@angular/router';



@Component({
  selector: 'app-update-boysdata',
  templateUrl: './update-boysdata.component.html',
  styleUrls: ['./update-boysdata.component.css']
})
export class UpdateBoysdataComponent implements OnInit {

  private boysList: Boys[];
  id: number;
  selectedBoy: object = {};

  private boy = new Boys();
  constructor(private boysService: BoysService, private toastr: ToastrService, private route: Router, public router: ActivatedRoute) { }

  ngOnInit() {
  
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
    this.router.params.subscribe(params => {
      this.id = +params['id'];
    })
    this.boysService.getBoy(this.id)
      .subscribe((data) => {
        if (data.id === this.id) {
          this.selectedBoy = data;
          //console.log(this.id)
        }
      })

  }

  
  updateData(boysform: NgForm) {
    this.boysService.updateBoys(this.id, boysform.value)
      .subscribe(data => {
        
        this.toastr.success("Updated Record Successfully ==>" + this.id);
        this.route.navigate(['']);
        
      })

  }
}
