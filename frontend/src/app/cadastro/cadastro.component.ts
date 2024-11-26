import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-cadastro',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './cadastro.component.html',
  styleUrl: './cadastro.component.css'
})
export class CadastroComponent {
 
  paciente = {
    nomeCompleto: '',
    nomeSocial: '',
    nomePai: '',
    nomeMae: '',
    dataNascimento: '',
    sexo: '',
    nacionalidade: '',
    racaCor: '',
    contato: '',
    cpf: '',
    identidade: ''
  };

  onSubmit() {
    console.log('Dados do paciente:', this.paciente);
  
  }
}