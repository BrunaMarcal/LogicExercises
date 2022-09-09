package com.example.programminglogic.exercises.fixed_password

// readline faz com que passe direto
fun main() {
    val senhaValida = "2002"
    print("Senha: ")
    val entrada: String = readln()

    while (entrada != senhaValida) {
        println("Senha invalida")
        print("Senha: ")
        readln()
    } ;if (entrada == senhaValida) {
        println("Acesso permitido")
    }
}




