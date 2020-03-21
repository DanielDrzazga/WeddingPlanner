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

  public findAll(): Observable<Guest[]> {
    return this.http.get<Guest[]>(this.guestsUrl);
  }

  public save(guest: Guest) {
    return this.http.post<Guest>(this.guestsUrl, guest);
  }
}
