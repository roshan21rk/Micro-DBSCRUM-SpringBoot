import { Http, RequestOptions, RequestMethod, Response, Headers } from '@angular/http';
import { Boys } from './../model/boys-model';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/Rx';



@Injectable()
export class BoysService {
  
  selectedBoy: Boys;
  boysList : Boys[];
  boy :Boys;
  id:number;
  constructor(private http : Http) {

    }

    postBoys(boys : Boys)
    {
      var body = JSON.stringify(boys);
      var headerOptions = new Headers({ 'Content-Type': 'application/json' });
      var requestOptions = new RequestOptions({ method: RequestMethod.Post, headers: headerOptions });
      return this.http.post('http://localhost:8061/api/dbScrum-service/Scrum/Add', body, requestOptions);
    }

    getBoys() 
    {
      return this.http.get('http://localhost:8061/api/dbScrum-service/Scrum/view' )
      .map((data :Response) =>  data.json())
      .catch((error :any) => Observable.throw('Get boys Server Error'));
    }
  getBoy(id:number) {
    return this.http.get('http://localhost:8061/api/dbScrum-service/Scrum/view/' +id)
      .map((data: Response) => data.json())
      .catch((error: any) => Observable.throw('Server Error'));
  }

    
  updateBoys(id:number, boys : Boys) {
    var body = JSON.stringify(boys);
    var headerOptions = new Headers({ 'Content-Type': 'application/json' });
    var requestOptions = new RequestOptions({ method: RequestMethod.Put, headers: headerOptions });
    return this.http.put('http://localhost:8061/api/dbScrum-service/Scrum/update/' +id, body, requestOptions);
  }
  deleteBoy(id:number)
  {
    return this.http.delete('http://localhost:8061/api/dbScrum-service/Scrum/delete/' +id)
      
  }
  setter(boy :Boys)
  {
    this.boy=boy;
  }
  getter()
  {
    return this.boy;
  }
  }


