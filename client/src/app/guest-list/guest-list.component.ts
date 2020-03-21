import {Component, OnInit} from '@angular/core';
import {Guest} from '../model/guest';
import {GuestService} from '../service/guest.service';


@Component({
  selector: 'app-guest-list',
  templateUrl: './guest-list.component.html',
  styleUrls: ['./guest-list.component.css']
})
export class GuestListComponent implements OnInit {

  guests: Guest[];

  constructor(private guestService: GuestService) {

  }

  ngOnInit() {
    this.guestService.findAll().subscribe(data => {
      this.guests = data;
    });
  }
}
