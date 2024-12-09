package br.sp.gov.fatec.ubs.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;
    
    @Column(unique=true)
    private String cpf;

    private String nomeSocial;
    private String nomeMae;
    private String dataNascimento;
    private String sexo;
    private String nacionalidade;
    private String municipioNascimento;
    private String racaCor;
    private String frequentaEscola;
    private String escolaridade;
    private String situacaoFamiliar;
    private String estabelecimentoVinculo;
    private String estabelecimentoCadastro;
    private String deficiencia;
    private String deficienciaDetalhe;

    private String celular;
    private String residencial;
    private String comercial;
    private String contato;
    private String email;

    private String origemEndereco;
    private String endereco;
    
    private String identidade;

    // Getters e Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getMunicipioNascimento() {
        return municipioNascimento;
    }

    public void setMunicipioNascimento(String municipioNascimento) {
        this.municipioNascimento = municipioNascimento;
    }

    public String getRacaCor() {
        return racaCor;
    }

    public void setRacaCor(String racaCor) {
        this.racaCor = racaCor;
    }

    public String getFrequentaEscola() {
        return frequentaEscola;
    }

    public void setFrequentaEscola(String frequentaEscola) {
        this.frequentaEscola = frequentaEscola;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getSituacaoFamiliar() {
        return situacaoFamiliar;
    }

    public void setSituacaoFamiliar(String situacaoFamiliar) {
        this.situacaoFamiliar = situacaoFamiliar;
    }

    public String getEstabelecimentoVinculo() {
        return estabelecimentoVinculo;
    }

    public void setEstabelecimentoVinculo(String estabelecimentoVinculo) {
        this.estabelecimentoVinculo = estabelecimentoVinculo;
    }

    public String getEstabelecimentoCadastro() {
        return estabelecimentoCadastro;
    }

    public void setEstabelecimentoCadastro(String estabelecimentoCadastro) {
        this.estabelecimentoCadastro = estabelecimentoCadastro;
    }

    public String getDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(String deficiencia) {
        this.deficiencia = deficiencia;
    }

    public String getDeficienciaDetalhe() {
        return deficienciaDetalhe;
    }

    public void setDeficienciaDetalhe(String deficienciaDetalhe) {
        this.deficienciaDetalhe = deficienciaDetalhe;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getResidencial() {
        return residencial;
    }

    public void setResidencial(String residencial) {
        this.residencial = residencial;
    }

    public String getComercial() {
        return comercial;
    }

    public void setComercial(String comercial) {
        this.comercial = comercial;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrigemEndereco() {
        return origemEndereco;
    }

    public void setOrigemEndereco(String origemEndereco) {
        this.origemEndereco = origemEndereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }
}
