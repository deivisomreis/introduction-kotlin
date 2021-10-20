package br.com.deivison.conta.app

import br.com.deivison.conta.dao.impl.ContaDAO
import br.com.deivison.conta.dao.impl.PessoaDAO
import br.com.deivison.conta.entity.*

class BankApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val endereco: Endereco = Endereco(logradouro = "rua brasil", numero = 1, complemento = "casa", bairro = "brasil", cidade = "guarulhos", estado = "sp", cep = "00000-000")
            val contaDAO: ContaDAO = ContaDAO()
            val pessoaDAO: PessoaDAO = PessoaDAO()

            val maria: Correntista = Correntista(nome = "maria", cpf = "1234", email = "maria@maria.com", telefone = "+551234", endereco)
            val joao: Correntista = Correntista(nome = "joao", cpf = "1234", email = "joao@joao.com", telefone = "+551234", endereco)

            pessoaDAO.save(maria)
            pessoaDAO.save(joao)

            val contaMaria: Conta = ContaPoupanca(correntista = maria, saldo = 1000.0, numero = 1000, dv = 1)
            val contaJoao: Conta = ContaCorrente(correntista = joao, saldo = 1000.0, limite = 100.0, numero = 1001, dv = 1)
            contaDAO.save(contaJoao)
            contaDAO.save(contaMaria)

            contaMaria.mostraDetalheConta()
            println()
            contaJoao.mostraDetalheConta()

            println()

            contaMaria.transfere(100.0, contaJoao)
            contaMaria.saca(100.0)

            contaMaria.mostraDetalheConta()
            println()
            contaJoao.mostraDetalheConta()
        }
    }
}