import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GuestListComponent } from './guest-list/guest-list.component';
import {GuestFormComponent} from './guest-form/guest-form.component';
import {GuestViewComponent} from './guest-view/guest-view.component';


const routes: Routes = [
  { path: 'guests/:id', component: GuestViewComponent },
  { path: 'guests', component: GuestListComponent },
  { path: 'addguest', component: GuestFormComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {  }
