package umfg.edu.jediMaster

import kotlin.system.exitProcess

var numero: Int = 0

fun main() {

    try {
        println("|  Calculo de Numero Primo |")
        println("| > Qual é o número: ")
        numero = readln().toInt()

        if (numero > 0) {
            validarNumero(numero)
        } else {

            do {
                println("| Número Inválido |")
                println("| > Qual é o número: ")
                numero = readln().toInt()
            } while (numero <= 0)

            validarNumero(numero)
        }
    } catch (ex: Exception) {
        println("Erro tipo: ${ex.printStackTrace()}")
    }

}

private fun validarNumero(numero: Int) {
    try {
        for (i in 2..Math.sqrt(numero.toDouble()).toInt()) {
            if (numero % i == 0) {
                println("$numero = não é primo")
                exitProcess(0)
            }
        }

        println("$numero = É PRIMO")
    } catch (ex: Exception) {
        println("Erro tipo: ${ex.printStackTrace()}")
    }

}