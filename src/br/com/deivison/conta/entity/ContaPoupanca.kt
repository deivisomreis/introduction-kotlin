package br.com.deivison.conta.entity

class ContaPoupanca(
    correntista: Correntista,
    numero: Int,
    dv: Int,
    saldo: Double
) : Conta(
    correntista,
    numero,
    dv,
    saldo) {
}