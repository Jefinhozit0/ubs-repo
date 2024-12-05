import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Paciente } from '../model/paciente';
import { PacienteService } from "../service/PacienteService";

@Component({
  selector: 'app-lista',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './lista.component.html',
  styleUrl: './lista.component.css',
  providers:[PacienteService]
})
export class ListaComponent {
mensagem: String = "";
pacientes: Paciente[] = [];

constructor(private service: PacienteService){
  this.listarPacientes();
}
  listarPacientes() {
    this.service.listar().subscribe({
        next: (data) =>{this.pacientes = data;},
        error: (msg) => {this.mensagem = "ocorreu erro"}
    });
  }


}