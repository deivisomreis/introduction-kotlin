package br.com.deivison.conta.entity

import br.com.deivison.conta.entity.br.Pessoa

class Correntista(
    nome: String,
    cpf: String,
    email: String,
    telefone: String,
    endereco: Endereco
) : Pessoa(nome, cpf, email, telefone, endereco){
}