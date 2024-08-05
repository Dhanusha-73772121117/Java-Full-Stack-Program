import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Pratice1';
  name : string;
  age : number;
  email : string;
  txtColor : string;
  image : string;
  fname : string = "";

  constructor(){
    this.name = "dhanu";
    this.age = 20;
    this.email = "dhanusha3010@gmail.com";
    this.txtColor = "green";
    this.image = "./assets/logo2.png";
    this.fname = "dhanu !!";
    
  }
  getAddition(a:number , b:number){
    let sum = a+b;
    return sum;
  }
  changeName(){
    this.name = "dhachu";
  }
  changeAge(){
    this.age = 21;
  }
  changeEmail(){
    this.email = "dhachu@123";
  }
  changeImage(){
    this.image = "./assets/logo2.png";
  }
}
