import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { GuestListComponent } from './guest-list/guest-list.component';
import { GuestService } from './service/guest.service';

@NgModule({
  declarations: [
    AppComponent,
    GuestListComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [GuestService],
  bootstrap: [AppComponent]
})
export class AppModule { }
