import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Paciente } from '../model/paciente';

@Injectable({
  providedIn: 'root',
})


export class PacienteService {
  listar() {
    throw new Error('Method not implemented.');
  }

  constructor(private http: HttpClient) { }

  public salvar(obj: Paciente): Observable<Paciente> {
    return this.http.post<Paciente>('http://localhost:8090/pacientes', obj);
  }

}
