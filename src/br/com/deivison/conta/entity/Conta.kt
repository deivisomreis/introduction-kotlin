package br.com.deivison.conta.entity

abstract class Conta(
    var correntista: Correntista,
    val numero: Int,
    val dv: Int,
    var saldo: Double
) {
    fun mostraDetalheConta(){
        println("conta: $numero dv: $dv")
        println("titular: ${correntista.nome} - email: ${correntista.email} - telefone: ${correntista.telefone}")
        println("saldo: $saldo")
    }

    fun saca(valor: Double){
        if(valor <  saldo){
            saldo-= valor
            println("saque: $valor efetuado com sucesso")
        } else
            println("saldo insuficiente")
    }

    fun transfere(valor: Double, contaDestino: Conta){
        if(valor <= this.saldo){
            this.saldo -= valor;
            contaDestino.deposita(valor)
            println("transferencia: $valor efetuado com sucesso")
        } else
            println("saldo insuficiente")
    }

    fun deposita(valor: Double){
        this.saldo += valor
        println("deposito: $valor efetuado com sucesso")
    }
}