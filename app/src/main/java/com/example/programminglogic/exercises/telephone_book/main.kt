package com.example.programminglogic.exercises.telephone_book

fun main() {
//    println("Coloque o nome do contato desejado: ")
//    readln()

    val contatos: MutableMap<String?, String?> = HashMap()
    contatos["Contato: Bruna \n" + "Telefone: 2725-5826"] = "Bruna"
    contatos["Contato: Leo \n" + "Telefone: 8746-8392"] = "Leo"
    contatos["Contato: Simone \n" + "Telefone: 7821-8573"] = "Simone"

    println(getKey(contatos, "Leo"))
}

fun <K, V> getKey(hashMap: Map<K, V>, entrada: V): K? {
    return hashMap.filter { entrada == it.value }.keys.first()
}
