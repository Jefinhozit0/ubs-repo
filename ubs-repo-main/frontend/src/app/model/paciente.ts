export class Paciente {
    // Atributos básicos
    public id: number = 0;
    public nome: string = "";
    public cpf: string = "";

    // Atributos adicionais
    public nomeSocial: string = "";
    public nomeMae: string = "";
    public dataNascimento: string = "";  // Usando string para data em formato ISO
    public sexo: string = "";  // Pode ser 'masculino', 'feminino', 'outro'
    public nacionalidade: string = "";
    public municipioNascimento: string = "";
    public racaCor: string = "";
    public frequentaEscola: string = "";  // Pode ser 'sim', 'nao'
    public escolaridade: string = "";
    public situacaoFamiliar: string = "";
    public estabelecimentoVinculo: string = "";
    public estabelecimentoCadastro: string = "";
    public deficiencia: string = "";
    public deficienciaDetalhe: string = "";  // Exemplo: "visual", "auditiva", etc.

    // Dados de contato
    public celular: string = "";
    public residencial: string = "";
    public comercial: string = "";
    public contato: string = "";
    public email: string = "";

    // Endereço
    public origemEndereco: string = "";
    public endereco: string = "";

    // Identidade
    public identidade: string = "";
}
