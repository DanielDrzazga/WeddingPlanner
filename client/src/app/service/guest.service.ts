import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Guest } from '../model/guest';
import {Observable} from 'rxjs';


@Injectable()
export class GuestService {

  private guestsUrl: string;

  constructor(private http: HttpClient) {
    this.guestsUrl = 'http://localhost:8080/guests';
  }

  private option(guest: Guest) {
    return {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      }),
      body: {
        firstName: guest.firstName,
        lastName: guest.lastName
      }
    };
  }

  public findAll(): Observable<Guest[]> {
    return this.http.get<Guest[]>(this.guestsUrl);
  }

  public createGuest(guest: Guest) {
    return this.http.post<Guest>(this.guestsUrl, guest);
  }

  public removeGuest(guest: Guest) {
    return this.http.delete(this.guestsUrl, this.option(guest));
  }

}
