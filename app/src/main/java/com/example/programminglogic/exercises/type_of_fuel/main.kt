package com.example.programminglogic.exercises.type_of_fuel

// Nao to sabendo testar

fun main() {
    var alcool = readln().toInt()
    var gasolina = readln().toInt()
    var diesel = readln().toInt()

    fun posto(cod: Opcoes) {
        val id = when (cod) {
            Opcoes.ALCOOL -> 1
            Opcoes.GASOLINA -> 2
            Opcoes.DIESEL -> 3
            Opcoes.FIM -> 4
        }
        while (id in 1..4) {
            if (id == 1) {
                alcool++
            } else if (id == 2) {
                gasolina++
            } else if (id == 3) {
                diesel++
            } else if (id == 4) {
                break
            } else {
                println("Codigo invalido.")
            }
            println("MUITO OBRIGADO \n Alcool: $alcool \n Gasolina: $gasolina \n Diesel: $diesel")
            break
        }
    }
}

