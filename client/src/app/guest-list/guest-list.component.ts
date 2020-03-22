import {Component, OnInit} from '@angular/core';
import {Guest} from '../model/guest';
import {GuestService} from '../service/guest.service';
import {ActivatedRoute, Router} from '@angular/router';


@Component({
  selector: 'app-guest-list',
  templateUrl: './guest-list.component.html',
  styleUrls: ['./guest-list.component.css']
})
export class GuestListComponent implements OnInit {

  guests: Guest[];

  constructor(private rout: ActivatedRoute, private router: Router, private guestService: GuestService) {

  }

  ngOnInit() {
    this.guestService.findAll().subscribe(data => {
      this.guests = data;
    });
  }

  deleteGuest(guest: Guest) {
    this.guestService.removeGuest(guest).subscribe(value => this.gotoGuestList());
    window.location.reload();
  }

  private gotoGuestList() {
    this.router.navigate(['/guests']);
  }
}
