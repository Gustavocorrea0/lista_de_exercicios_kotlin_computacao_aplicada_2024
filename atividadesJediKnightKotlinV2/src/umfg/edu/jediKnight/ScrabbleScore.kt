package umfg.edu.jediKnight

fun main() {
    println("+------------------------------------------------+")
    println("|                  Scrabble Score                |")
    println("+------------------------------------------------+")
    println("| > Digite uma palavra para calcular o score:")
    val palavra = readLine()?.toLowerCase() ?: ""

    val score = palavra
        .filter { it.isLetter() }
        .sumBy { calcularPontuacao(it) }

    println("+------------------------------------------------+")
    println("| > O score da palavra '$palavra' é: $score")
}

fun calcularPontuacao(letra: Char): Int {
    return when (letra) {
        in "aeioulnrst" -> 1
        in "dg" -> 2
        in "bcmp" -> 3
        in "fhvwy" -> 4
        in "k" -> 5
        in "jx" -> 8
        in "qz" -> 10
        else -> 0
    }
}