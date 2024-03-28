package umfg.edu.jediKnight
var tipoInformacao: Int = 0

fun main() {
    do {
        println("+------------------------------------------------+")
        println("|                     Palindromo                 |")
        println("+------------------------------------------------+")
        println("| > Voce deseja inserir")
        println("| 1 - Palavra")
        println("| 2 - Frase")
        println("| 3 - Numero")
        tipoInformacao = readln().toInt()
    } while (tipoInformacao != 1 && tipoInformacao != 2 && tipoInformacao != 3)

    when (tipoInformacao) {
        1 -> {
            println("+------------------------------------------------+")
            println("| > Qual é a palavra: ")
            var palavra = readln()

            if (palindromo(palavra)) {
                println("$palavra é um palíndromo.")
            } else {
                println("$palavra não é um palíndromo.")
            }
        }

        2 -> {
            println("+------------------------------------------------+")
            println("| > Qual é a Frase: ")
            var frase = readln()
            if (palindromo(frase)) {
                println("$frase é um palíndromo.")
            } else {
                println("$frase não é um palíndromo.")
            }
        }

        3 -> {
            println("+------------------------------------------------+")
            println("| > Qual é o Numero: ")
            val numero = readLine()?.toIntOrNull() ?: 0
            if (palindromo(numero.toString())) {
                println("$numero é um palíndromo.")
            } else {
                println("$numero não é um palíndromo.")
            }
        }

    }

}

private fun palindromo(input: String): Boolean {
    val cleanInput = input.replace("\\s".toRegex(), "")
    return cleanInput == cleanInput.reversed()
}