import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { UserService } from 'src/app/services/user.service';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  constructor(private userService:UserService,private snack:MatSnackBar) { }

   public user={
username:'',
firstName:'',
lastName:'',
email:'',
phone:'',
password:'',
address:''
   }
  ngOnInit(): void {
  }

  formSubmit(){
    console.log(this.user);
    if(this.user.username=='' ||this.user.username==null){
       alert('username is required');
    //   this.snack.open('Username is required !!','Ok',{
    //     duration:2000,
    //     verticalPosition:'top'
    //   })
      return;
    };
    

  //  addUser function

   this.userService.addUser(this.user).subscribe(
     (data)=>{
  //     //sucess
       console.log(data);
  //     //Swal.fire('Successfully Done !!', 'Registration Done');
   
        alert('sucess');
     },
    (error)=>{
  //     //error
       console.log(error);
        alert('not sucess');
  //     // this.snack.open('Something went wrong !!',"",{
  //     //   duration:2000
  //     // })
    }
   );


  }


  

}
