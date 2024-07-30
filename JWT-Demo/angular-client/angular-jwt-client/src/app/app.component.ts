import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import axios from 'axios';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  
  username: String = "";
  password: String = "";


  updateUsername(event: any) {
    console.log(event.target.value);
    this.username = event.target.value;
  }

  updatePassword(event: any) {
    console.log(event.target.value);
    this.password = event.target.value;
  }
  
  

  async doLogin() {
    /*
      Regardless of Angular, here's the code you will be interested in. This is just JS/TS
      using axios to make requests. 
    */
    let url = "http://localhost:8080/authenticate";

    let dataObj = {
      "username": this.username,
      "password": this.password
    };

    let optionsObj = {
      "withCredentials": true,
      headers: {
        'Content-Type': 'application/json'
      }
    }

    //If you get a weird error with the options object, try inlining it instead
    let response = await axios.post(url, dataObj, optionsObj);
    console.log(response);
    let responseBodyObj = response.data;
    console.log("bodyobj:", responseBodyObj);
  }

  async doCookieTest() {
    let url = "http://localhost:8080/secret";
    let optionsObj = {
      "withCredentials": true
    }

    let response = await axios.get(url, optionsObj);
    console.log(response);
  }
}
