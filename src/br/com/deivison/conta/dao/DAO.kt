package br.com.deivison.conta.dao

interface DAO<T> {

    fun get(id: Int): T
    fun update(id: Int, t: T)
    fun save(t: T)
    fun remove(id: Int)
    fun list(): MutableList<T>
}