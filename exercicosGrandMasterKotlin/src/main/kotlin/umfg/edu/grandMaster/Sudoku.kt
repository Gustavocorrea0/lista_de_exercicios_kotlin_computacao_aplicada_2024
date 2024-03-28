package umfg.edu.grandMaster
import kotlin.random.Random

fun main() {

    println("+----------------------------------+")
    println("|              Sudoku              |")
    val nR0 = 0
    val nR1 = 1
    val nR2 = 2
    val nR3 = 3
    val nR4 = 4
    val nR5 = 5
    val nR6 = 6
    val nR7 = 7
    val nR8 = 8

    var tabuleiro = arrayOf(
        intArrayOf(nR3, nR2, nR4, nR7, nR1, nR3, nR2, nR2, nR8),
        intArrayOf(nR0, nR1, nR2, nR3, nR4, nR1, nR3, nR4, nR2),
        intArrayOf(nR2, nR3, nR4, nR3, nR4, nR7, nR2, nR8, nR0),
        intArrayOf(nR0, nR3, nR2, nR8, nR5, nR3, nR6, nR3, nR4),
        intArrayOf(nR8, nR7, nR5, nR3, nR0, nR6, nR1, nR2, nR7),
        intArrayOf(nR4, nR1, nR4, nR8, nR2, nR8, nR8, nR5, nR3),
        intArrayOf(nR2, nR3, nR2, nR4, nR8, nR2, nR5, nR6, nR5),
        intArrayOf(nR8, nR4, nR2, nR0, nR7, nR1, nR4, nR3, nR2),
        intArrayOf(nR1, nR7, nR2, nR0, nR4, nR5, nR2, nR2, nR7)
    )

    println("+----------------------------------+")
    println("|             Tabuleiro            |")
    println("+----------------------------------+")
    for (linha in tabuleiro) {
        for (numero in linha){
            print(" $numero |")
        }
        println()
    }
    println("+----------------------------------+")

    while (!jogoCompleto(tabuleiro)) {
        print("| > Insira a linha (1-9): ")
        val linha = readLine()?.toIntOrNull()?.minus(1) ?: continue

        println("+----------------------------------+")
        print("| > Insira a coluna (1-9): ")
        val coluna = readLine()?.toIntOrNull()?.minus(1) ?: continue

        if (linha !in 0..8 || coluna !in 0..8) {
            println("+----------------------------------+")
            println("|    Linha ou coluna inválida      |")
            continue
        }

        if (tabuleiro[linha][coluna] != 0) {
            println("+----------------------------------+")
            println("| Essa posição já está preenchida  |")
            println("+----------------------------------+")
            continue
        }

        var numeroDoUsuario = 0

        do {
            println("+----------------------------------+")
            print("| > Insira um número de 1 a 9: ")
            numeroDoUsuario = readLine()?.toInt()!!
        } while (numeroDoUsuario !in 1..9)


        tabuleiro[linha][coluna] = numeroDoUsuario
        println("+----------------------------------+")
        println("|             Tabuleiro            |")
        println("+----------------------------------+")
        for (linha in tabuleiro) {
            for (numero in linha){
                print(" $numero |")
            }
            println()
        }
    }

    println("+----------------------------------+")
    println("|           Fim de Jogo            |")
    println("+----------------------------------+")
}

fun jogoCompleto(tabuleiro: Array<IntArray>): Boolean {
    for (linha in tabuleiro) {
        for (numero in linha) {
            if (numero == 0) {
                return false
            }
        }
    }
    return true
}

