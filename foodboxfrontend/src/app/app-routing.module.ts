import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { HomeComponent } from './pages/home/home.component';
import { LoginComponent } from './pages/login/login.component';
import { SignupComponent } from './pages/signup/signup.component';
import { UserdashboardComponent } from './pages/userdashboard/userdashboard.component';
//import { AdminGuard } from './services/admin.guard';

const routes: Routes = [
  {

    path: '',
    component: HomeComponent,
    pathMatch: 'full',
  },
  {
    path: 'signup',
    component: SignupComponent,
    pathMatch: 'full',
  },
  {

    path: 'login',
    component: LoginComponent,
    pathMatch: 'full',
  },
  {

    path: 'admin',
    component: DashboardComponent,
    pathMatch: 'full',
    //canActivate:[AdminGuard],
  },
  {

    path: 'userdash',
    component: UserdashboardComponent,
    pathMatch: 'full',
  },
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
