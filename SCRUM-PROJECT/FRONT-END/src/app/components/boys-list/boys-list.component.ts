import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { Boys } from './../../model/boys-model';
import { BoysService } from './../../service/boys.service';
import { Component, OnInit } from '@angular/core';



@Component({
  selector: 'app-boys-list',
  templateUrl: './boys-list.component.html',
  styleUrls: ['./boys-list.component.css']
})
export class BoysListComponent implements OnInit {


  private boysList : Boys[];
  constructor(private boysService :BoysService, private toastr :ToastrService,private route : Router) { }

  ngOnInit() {
    console.log(
    this.boysService.getBoys().subscribe((data : Boys[])=>
    { this.boysList = data}));
  }

  showEditform(boys)
  {
    this.route.navigate(['']);
  this.boysService.selectedBoy=Object.assign({},boys);
   //this.boysService.setter(boys);
  
    
  }

  onDelete(boys)
  {
    if (confirm('Are you sure to delete this record ?') == true)
    this.boysService.deleteBoy(boys.id).subscribe((data) =>
  {
    this.boysList.splice(this.boysList.indexOf(boys),1);
    console.log(data);
  },(error)=>{console.log(error);
  });
}

    
    
    
  }



