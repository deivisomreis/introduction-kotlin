package br.com.deivison.conta.entity

class ContaCorrente(
    correntista: Correntista,
    numero: Int,
    dv: Int,
    saldo: Double,
    limite: Double)
    : Conta(
    correntista,
    numero,
    dv,
    saldo) {
}