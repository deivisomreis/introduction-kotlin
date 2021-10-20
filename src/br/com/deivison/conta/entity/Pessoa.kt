package br.com.deivison.conta.entity.br

import br.com.deivison.conta.entity.Endereco

open class Pessoa(
    var nome: String,
    var cpf: String,
    var email: String,
    var telefone: String,
    var endereco: Endereco){


}