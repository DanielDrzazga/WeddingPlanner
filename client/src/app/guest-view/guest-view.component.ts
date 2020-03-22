import {Component, Input, OnInit} from '@angular/core';
import {Guest} from '../model/guest';
import {ActivatedRoute, Router} from '@angular/router';
import {GuestService} from '../service/guest.service';

@Component({
  selector: 'app-guest-view',
  templateUrl: './guest-view.component.html',
  styleUrls: ['./guest-view.component.css']
})
export class GuestViewComponent implements OnInit {

  guest: Guest;
  private guestId: any;

  constructor(private rout: ActivatedRoute, private router: Router, private guestService: GuestService) {
    this.guest = new Guest();
  }

  ngOnInit(): void {
    this.guestId = this.rout.snapshot.paramMap.get('id');
    this.loadGuestDetails(this.guestId);
  }

  loadGuestDetails(guestId) {
    this.guestService.findById(guestId).subscribe(guest => {
      this.guest = guest;
    });
  }

  deleteGuest(id) {
    this.guestService.removeGuest(id).subscribe(value => {
      this.router.navigate(['/guests']);
    });
  }

  onSubmit() {
    this.guestService.createGuest(this.guest).subscribe(value => {
      this.router.navigate(['/guests']);
    });
  }

}

