package com.example.programminglogic.exercises.circle_area
import kotlin.math.pow

fun main () {

    val raio = readLine()?.toDouble()
    val pi = 3.14159

    raio?.let {
        val areaCirculo =  pi*raio.pow(2)
        val resultado = "%.4f".format(areaCirculo)

        println("A= $resultado")

    }
}



