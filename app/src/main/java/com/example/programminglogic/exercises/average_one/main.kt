package com.example.programminglogic.exercises.average_one


fun main() {
    val valorA = readln().toInt()
    val valorB = readln().toInt()

//    if (valorA < 0 && valorA > 10 && valorB < 0 && valorB > 10) {
//        println("Essa nota não é válida")
//    }

    while (valorA in 0..10 && valorB in 0..10) {
        val media = (valorA + valorB) / 2.toDouble()
        val resultado = "%.2f".format(media)
        if (media in 0.0..10.0) {
            println("MEDIA = $resultado")
            break
        }
        println("nota invalida")
    }
}


