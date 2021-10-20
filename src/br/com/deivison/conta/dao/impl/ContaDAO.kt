package br.com.deivison.conta.dao.impl

import br.com.deivison.conta.dao.DAO
import br.com.deivison.conta.entity.Conta

class ContaDAO : DAO<Conta> {
    private var db: MutableList<Conta> = mutableListOf()

    override fun get(id: Int): Conta {
        return db.get(id)
    }

    override fun update(id: Int, t: Conta) {
        db.set(id, t)
    }

    override fun save(t: Conta) {
        db.add(t)
    }

    override fun remove(id: Int) {
        db.removeAt(id)
    }

    override fun list(): MutableList<Conta> {
        return db
    }
}