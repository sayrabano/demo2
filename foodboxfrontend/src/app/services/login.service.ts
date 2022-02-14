import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http:HttpClient) { }
//get current user

// public getCurrentUser(){
//   return this.http.get(`${baseUrl}/current-user`);
// }
//   //generateToken

//   public generateToken(loginData:any){
//     return this.http.post(`${baseUrl}/generate-token`,loginData);

//   }

//   //login user
//   public loginUser(token:any){
//     localStorage.setItem('token',token);
//     return true;

//   }

//   public isLoggedIn(){
//     let tokenstr = localStorage.getItem('token');
//     if(tokenstr==undefined || tokenstr=='' || tokenstr==null){
//       return false;
//     }else{
//       return true;
//     }

   
//   }
//  //logout
//  public logout(){
//   localStorage.removeItem('token');
//   localStorage.removeItem('user');
//   return true;
// }

// //get token
// public getToken(){
//   return localStorage.getItem('token');
  
// }


// //set user
// public setUser(user:any){
// localStorage.setItem('user',JSON.stringify(user));
// }
// public getUser(){
//   let userStr = localStorage.getItem('user');
//   if(userStr!=null){
//     return JSON.parse(userStr);
//   }
//   else{
//     this.logout();
//     return null;
//   }
// }
// //get user role

// public getUserRole(){
//   let user = this.getUser();
//   return user.authorities[0].authority;
// }

}
