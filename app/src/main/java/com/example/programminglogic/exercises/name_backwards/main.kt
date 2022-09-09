package com.example.programminglogic.exercises.name_backwards

fun main() {
    val palavra = "Salada"
    val reversor = reverter(palavra)
    println(reversor)

}

fun reverter(palavra: String): String {
    var reverso = " "

    for (i in palavra.length - 1 downTo 0) {
        reverso += palavra[i]
    }
    return reverso
}






