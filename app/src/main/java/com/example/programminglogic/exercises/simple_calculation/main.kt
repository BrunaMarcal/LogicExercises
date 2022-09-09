package com.example.programminglogic.exercises.simple_calculation

fun main() {
    val valorProduto = 300.0
    val formaDePagamento = 3
    val debito = 1
    val credito = 2

    if (formaDePagamento == debito) {
        val desconto = valorProduto * 10 / 100
        val resultadoD = valorProduto - desconto
        println("Com 10% de desconto o valor do produto é: $resultadoD")
    } else if (formaDePagamento == credito) {
        val aumento = valorProduto * 10 / 100
        val resultadoC = aumento + valorProduto
        println("Com 10% de aumento o valor do produto é: $resultadoC")
    } else println("Forma de pagamento inválida")
}