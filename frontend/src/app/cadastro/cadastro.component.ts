import { Component } from '@angular/core';
import { EsusService } from '../services/esus.service';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent {
  form = {
    nomeCompleto: '',
    nomeSocial: '',
    nomeMae: '',
    nomePai: '',
    dataNascimento: '',
    sexo: '',
    nacionalidade: '',
    municipioNascimento: '',
    racaCor: '',
    frequentaEscola: '',
    escolaridade: '',
    situacaoFamiliar: '',
    estabelecimentoVinculo: '',
    estabelecimentoCadastro: '',
    deficiencia: '',
    telefoneCelular: '',
    telefoneResidencial: '',
    telefoneComercial: '',
    telefoneContato: '',
    email: '',
    origemEndereco: '',
    cep: '',
    logradouro: '',
    numero: '',
    bairro: '',
    complemento: '',
    referencia: '',
    cpf: '',
    identidade: ''
  };

  constructor(private esusService: EsusService) {}

  onSubmit(): void {
    this.esusService.create(this.form).subscribe({
      next: () => alert('Registro salvo com sucesso!'),
      error: (err: { message: string; }) => alert('Erro ao salvar o registro: ' + err.message)
    });
  }

  resetForm(): void {
    this.form = {
      nomeCompleto: '',
      nomeSocial: '',
      nomeMae: '',
      nomePai: '',
      dataNascimento: '',
      sexo: '',
      nacionalidade: '',
      municipioNascimento: '',
      racaCor: '',
      frequentaEscola: '',
      escolaridade: '',
      situacaoFamiliar: '',
      estabelecimentoVinculo: '',
      estabelecimentoCadastro: '',
      deficiencia: '',
      telefoneCelular: '',
      telefoneResidencial: '',
      telefoneComercial: '',
      telefoneContato: '',
      email: '',
      origemEndereco: '',
      cep: '',
      logradouro: '',
      numero: '',
      bairro: '',
      complemento: '',
      referencia: '',
      cpf: '',
      identidade: ''
    };
  }
}
