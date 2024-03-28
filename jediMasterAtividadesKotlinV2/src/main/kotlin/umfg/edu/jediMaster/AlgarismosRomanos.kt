package umfg.edu.jediMaster

import kotlin.system.exitProcess

private var valorI: Int = 1
private var valorV: Int = 5
private var valorX: Int = 10
private var valorL: Int = 50
private var valorC: Int = 100
private var valorD: Int = 500
private var valorM: Int = 1000

private var valoresLetras =
    mapOf('I' to valorI, 'V' to valorV, 'X' to valorX, 'L' to valorL, 'C' to valorC, 'D' to valorD, 'M' to valorM)

fun main() {

    println("+--------------------------------------+")
    println("|           Algarismos Romanos         |")
    println("+--------------------------------------+")
    println("|                Valores               |")
    println("+--------------------------------------+")
    println("|      Símbolo      |       Valor      |")
    println("|         I         |        1         |")
    println("|         V         |        5         |")
    println("|         X         |        10        |")
    println("|         L         |        50        |")
    println("|         C         |        100       |")
    println("|         D         |        500       |")
    println("|         M         |        1000      |")
    println("+--------------------------------------+")

    println("| > Quais são os simbolos escolhidos: ")
    val simbolo = readln()

    if (simbolo != null) {
        conversaoParaNumero(simbolo)
    }
}

private fun conversaoParaNumero(simbolo: String) {
    try {
        var soma = 0

        if (simbolo.isNullOrEmpty()){
            println("+--------------------------------------+")
            println("| > Simbolo:       | > Valor: INVÁLIDO |")
            println("+--------------------------------------+")
            exitProcess(0)
        }

        for (letraObtida in simbolo) {
            val valor = valoresLetras[letraObtida]
            if (valor != null) {
                soma = soma + valor
            }
        }

        println("+--------------------------------------+")
        println("| > Simbolo: $simbolo | > Valor: $soma")
        println("+--------------------------------------+")

    } catch (e: Exception) {
        println("Erro tipo: ${e.printStackTrace()}")
    }
}