package br.com.deivison.conta.dao.impl

import br.com.deivison.conta.dao.DAO
import br.com.deivison.conta.entity.br.Pessoa

class PessoaDAO : DAO<Pessoa> {
    private var db: MutableList<Pessoa> = mutableListOf()

    override fun get(id: Int): Pessoa {
        return db.get(id)
    }

    override fun update(id: Int, t: Pessoa) {
        db.set(id, t)
    }

    override fun save(t: Pessoa) {
        db.add(t)
    }

    override fun remove(id: Int) {
        db.removeAt(id)
    }

    override fun list(): MutableList<Pessoa> {
        return db
    }
}