package com.example.programminglogic.exercises.grade_validation


fun main() {
    val notaA = 10.0
    val notaB = 5.0
    val media: Double = (notaA + notaB) / 2
    val resultado = "%.2f".format(media)

    while (media in 0.0..10.0) {
        println("Media = $resultado")
        break
    }; if (media < 0.0 || media > 10.0) {
        println("Nota invalida")
    }
}
