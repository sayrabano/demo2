import { HttpEvent, HttpHandler, HttpInterceptor, HttpRequest, HTTP_INTERCEPTORS } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { LoginService } from "./login.service";
// const Token_Header = "Authorization";

// @Injectable()
// export class AuthInterceptor implements HttpInterceptor{
//    constructor(private service:LoginService){}
   
// //     intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
// // let authReq =req;
// //        const token = this.service.getToken();
// //        console.log("interceptor");

//        if(token!=null){
//            authReq = authReq.clone({setHeaders: {Authorization:`Bearer ${token}`},
//         });
//        }
//              return next.handle(authReq);
        
//     }
 
// }

// export const AuthInterceptorProvider=[{
// provide:HTTP_INTERCEPTORS,
// useClass:AuthInterceptor,
// multi:true,

// },];