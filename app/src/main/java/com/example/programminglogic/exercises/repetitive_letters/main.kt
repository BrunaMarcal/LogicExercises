fun main() {
    val palavra = readln()
    println(contagem(palavra, 'b'))
}

fun contagem(letra: String, caracter: Char): Int {
    var resultadoContagem = 0
    for (i in letra) {
        if (i == caracter) {
            resultadoContagem++
        }
    }
    return resultadoContagem
}

