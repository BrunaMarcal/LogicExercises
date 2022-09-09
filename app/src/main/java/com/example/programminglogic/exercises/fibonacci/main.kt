package com.example.programminglogic.exercises.fibonacci


//toLong = recebe uma expressao como argumento e retorna um numero.


fun main(){
    for(i in 0..46) {
        print(" " + fibonacci(i))
    }
}

fun fibonacci(numero: Int): Long{
    return if (numero < 2){
        numero.toLong()
    } else {
        fibonacci(numero-1) + fibonacci(numero-2)
    }
}

