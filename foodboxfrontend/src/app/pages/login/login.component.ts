import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginData = {
    username: '',
    
    password: ''
  };
  constructor(private snack: MatSnackBar, private loginServic: LoginService,private router:Router) { }

  ngOnInit(): void {
  }
  formSubmit() {
    console.log('submit');
    if (this.loginData.username.trim() == '' || this.loginData.username == null) {
      this.snack.open("Username is required!!", '', {
        duration: 2000,
      });
      return;
    }

    if (this.loginData.password.trim() == '' || this.loginData.password == null) {
      this.snack.open("Password is required!!", '', {
        duration: 2000,
      });
      return;
    }

   

  //   this.loginServic.generateToken(this.loginData).subscribe((data: any) =>
  //   {
  //     console.log('Success')
  //     console.log(data);

  //     //login
  //     this.loginServic.loginUser(data.token);
  //     this.loginServic.getCurrentUser().subscribe();
  //     (user:any) =>{
  //       this.loginServic.setUser(user);
  //       console.log(user);

  //       //redirect
  //       if(this.loginServic.getUserRole()=='ADMIN'){
  //         window.location.href='/admin';
  //         // this.router.navigate(['admin']);
  //       }else if(this.loginServic.getUserRole()=='NORMAL'){
  //         window.location.href='/userdash';
  //       }else{
  //         this.loginServic.logout();
  //       }
  //     }
      
  //   },

  //   (error) => {
  //     console.log('Error!');
  //     console.log(error);

  //   });


  // }

  }
}
