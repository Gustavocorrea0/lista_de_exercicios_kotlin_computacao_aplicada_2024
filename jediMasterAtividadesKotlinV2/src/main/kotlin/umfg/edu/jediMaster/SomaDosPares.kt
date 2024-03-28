package umfg.edu.jediMaster

import java.lang.Exception
import kotlin.system.exitProcess

fun main() {
    var vetorDeNumeros = mutableListOf<Int>()
    var escolha = ""
    var numeroDigitado: Int


    try {
        println("Calculo de Média")
        while (escolha != "N") {
            println("Deseja adicionar um número S (p/ Sim) ou N (p/ Não): ")
            escolha = readln().uppercase()

            if (escolha.equals("S")) {
                println("Qual é o número: ")
                numeroDigitado = readln().toInt()
                vetorDeNumeros.add(numeroDigitado)
            }
        }

        if (vetorDeNumeros.isNotEmpty()) {
            var media = vetorDeNumeros.sum().toDouble() / vetorDeNumeros.size
            println("Média do números = $media")
            exitProcess(0)
        }

        println("Média do números = 0")

    } catch (ex: Exception) {
        println("Erro tipo ${ex.message}")
    }

}

