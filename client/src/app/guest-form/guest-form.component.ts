import { Component, OnInit } from '@angular/core';
import {Guest} from '../model/guest';
import {ActivatedRoute, Router} from '@angular/router';
import {GuestService} from '../service/guest.service';

@Component({
  selector: 'app-guest-form',
  templateUrl: './guest-form.component.html',
  styleUrls: ['./guest-form.component.css']
})
export class GuestFormComponent {

  guest: Guest;

  constructor(private rout: ActivatedRoute, private router: Router, private guestService: GuestService) {
    this.guest = new Guest();
  }

  onSubmit() {
    this.guestService.createGuest(this.guest).subscribe(value => this.gotoGuestList());
  }

  private gotoGuestList() {
    this.router.navigate(['/guests']);
  }
}
