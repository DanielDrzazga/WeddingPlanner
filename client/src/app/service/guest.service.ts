import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Guest } from '../model/guest';
import {Observable} from 'rxjs';


@Injectable()
export class GuestService {

  private guestsUrl: string;
  private guestUrl: string;

  constructor(private http: HttpClient) {
    this.guestsUrl = 'http://localhost:8080/guests';
    this.guestUrl = 'http://localhost:8080/guest';
  }

  public findAll(): Observable<Guest[]> {
    return this.http.get<Guest[]>(this.guestsUrl);
  }

  public findById(id) {
    return this.http.get<Guest>(this.guestUrl + '/' + id);
  }

  public createGuest(guest: Guest) {
    return this.http.post<Guest>(this.guestsUrl, guest);
  }

  public removeGuest(id) {
    return this.http.delete(this.guestUrl + '/' + id);
  }

}
