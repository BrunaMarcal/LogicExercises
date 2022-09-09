package com.example.programminglogic.exercises.area

// Eu sei que da pra melhorar, só que travei.

fun main() {
    val valorA = 2.0
    val valorB = 3.0
    val valorC = 5.0
    val pi = 3.14159

    val triangulo = valorA * valorB /2
    val areaTriangulo = "%.3f".format(triangulo)
    println("TRIANGULO: $areaTriangulo")

    val circulo = valorC * 2 * pi
    val areaCirculo = "%.3f".format(circulo)
    println("CIRCULO: $areaCirculo")

    val trapezio = valorA + valorB * valorC / 2
    val areaTrapezio = "%.3f".format(trapezio)
    println("TRAPEZIO: $areaTrapezio")

    val quadrado = valorB * valorB
    val areaQuadrado = "%.3f".format(quadrado)
    println("QUADRADO: $areaQuadrado")

    val retangulo = valorA * valorB
    val areaRetangulo = "%.3f".format(retangulo)
    println("RETANGULO: $areaRetangulo")

}




