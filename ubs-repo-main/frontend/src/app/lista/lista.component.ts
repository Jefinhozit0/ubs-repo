import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms'; // Importando o FormsModule
import { Paciente } from '../model/paciente';
import { PacienteService } from '../service/paciente.service';

@Component({
  selector: 'app-lista',
  standalone: true,
  imports: [CommonModule, FormsModule], // Adicionando FormsModule aqui
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.css'],
  providers: [PacienteService]
})
export class ListaComponent {
  mensagem: string = '';
  pacientes: Paciente[] = [];
  pacienteSelecionado: Paciente | null = null;

  constructor(private service: PacienteService) {
    this.listarPacientes();
  }

  listarPacientes() {
    this.service.listar().subscribe({
      next: (data) => {
        this.pacientes = data;
      },
      error: (msg) => {
        this.mensagem = 'Ocorreu um erro ao carregar os pacientes.';
      }
    });
  }

  editar(paciente: Paciente) {
    this.pacienteSelecionado = { ...paciente };
  }

  salvar() {
    if (this.pacienteSelecionado) {
      this.service.salvar(this.pacienteSelecionado).subscribe({
        next: (response) => {
          this.mensagem = 'Paciente atualizado com sucesso!';
          this.listarPacientes();
          this.cancelarEdicao();
        },
        error: (err) => {
          this.mensagem = 'Erro ao salvar o paciente.';
        }
      });
    }
  }

  cancelarEdicao() {
    this.pacienteSelecionado = null;
  }

  excluir(paciente: Paciente) {
    this.service.excluir(paciente.id).subscribe({
      next: () => {
        this.mensagem = 'Paciente excluído com sucesso!';
        this.listarPacientes();
      },
      error: (err) => {
        this.mensagem = 'Erro ao excluir o paciente.';
      }
    });
  }
}
