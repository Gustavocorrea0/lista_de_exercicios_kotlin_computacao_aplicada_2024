package umfg.edu.jediKnight

import kotlin.system.exitProcess

var candidatoA: Int = 0
var candidatoB: Int = 0
var candidatoC: Int = 0
var brancos: Int = 0
var nulos: Int = 0

var totalDeVotos: Int = 0

fun main() {
    menu()
}

private fun menu() {
    do {
        println("Votação para Presidente Sindical")
        println("1 - Votar")
        println("0 - Finalizar Votação")
        var op = readln().toInt()

        when (op) {
            1 -> votar()
            0 -> fechar()
            else -> {
                println("Escolha inválida")
            }
        }

    } while (op != 0)
}

private fun votar() {
    var confirmar: Int
    var voto: Int

    do {
        println("VOTAR")
        println("14 - Candidato A")
        println("23 - Candidato B")
        println("32 - Candidato C")
        println("3 - Branco")
        println("0 - Nulo")
        voto = readln().toInt()
    } while (voto != 14 && voto != 23 && voto != 32 && voto != 3 && voto != 0)


    if (voto == 14) {
        do {
            println("CONFIRMAR VOTO EM: Candidato A")
            println("1 PARA SIM e 2 PARA NÃO: ")
            confirmar = readln().toInt()
        } while (confirmar != 1 && confirmar != 2)

        if (confirmar == 1) {
            candidatoA = candidatoA + 1
            println("Você votou no Candidato A")
            menu()
        }

        if (confirmar == 2) {
            println("Voto cancelado")
            votar()
        }
    }

    if (voto == 23) {
        do {
            println("CONFIRMAR VOTO EM: Candidato B")
            println("1 PARA SIM e 2 PARA NÃO: ")
            confirmar = readln().toInt()
        } while (confirmar != 1 && confirmar != 2)

        if (confirmar == 1) {
            candidatoB = candidatoB + 1
            println("Você votou no Candidato B")
            menu()
        }

        if (confirmar == 2) {
            println("Voto cancelado")
            votar()
        }
    }

    if (voto == 32) {
        do {
            println("CONFIRMAR VOTO EM: Candidato C")
            println("1 PARA SIM e 2 PARA NÃO: ")
            confirmar = readln().toInt()
        } while (confirmar != 1 && confirmar != 2)

        if (confirmar == 1) {
            candidatoC = candidatoC + 1
            println("Você votou no Candidato C")
            menu()
        }

        if (confirmar == 2) {
            println("Voto cancelado")
            votar()
        }
    }

    if (voto == 3) {
        do {
            println("CONFIRMAR VOTO EM: BRANCO")
            println("1 PARA SIM e 2 PARA NÃO: ")
            confirmar = readln().toInt()
        } while (confirmar != 1 && confirmar != 2)

        if (confirmar == 1) {
            brancos = brancos + 1
            println("Você votou em BRANCO")
            menu()
        }

        if (confirmar == 2) {
            println("Voto cancelado")
            votar()
        }

    }

    if (voto == 0) {
        do {
            println("+------------------------------------------------+")
            println("| CONFIRMAR VOTO EM: NULO")
            println("+------------------------------------------------+")
            println("| > 1 PARA SIM e 2 PARA NÃO: ")
            confirmar = readln().toInt()
        } while (confirmar != 1 && confirmar != 2)

        if (confirmar == 1) {
            nulos = nulos + 1
            println("Você votou em NULO")
            menu()
        }

        if (confirmar == 2) {
            println("Voto cancelado")
            votar()
        }

    }

}

private fun fechar() {

    var percentualCandidatoA = 0.0
    var percentualCandidatoB = 0.0
    var percentualCandidatoC = 0.0
    var percentualNulos = 0.0
    var percentualBrancos = 0.0

    totalDeVotos = candidatoA + candidatoB + candidatoC + brancos + nulos

    percentualCandidatoA = (candidatoA.toDouble() / totalDeVotos.toDouble()) * 100
    percentualCandidatoB = (candidatoB.toDouble() / totalDeVotos.toDouble()) * 100
    percentualCandidatoC = (candidatoC.toDouble() / totalDeVotos.toDouble()) * 100
    percentualBrancos = (brancos.toDouble() / totalDeVotos.toDouble()) * 100
    percentualNulos = (nulos.toDouble() / totalDeVotos.toDouble()) * 100

    if (totalDeVotos == 0) {
        println("| > SEM VOTOS |")
        exitProcess(0)
    }

    println("+------------------------------------------------------------+")
    println("| > Total de eleitores: $totalDeVotos")
    println("+------------------------------------------------------------+")
    println("| > Votos Candidato A: $candidatoA | > Percentual: $percentualCandidatoA%")
    println("| > Votos Candidato B: $candidatoB | > Percentual: $percentualCandidatoB%")
    println("| > Votos Candidato C: $candidatoC | > Percentual: $percentualCandidatoC%")
    println("| > Votos Brancos: $brancos | > Percentual: $percentualBrancos%")
    println("| > Votos Nulos: $nulos | > Percentual: $percentualNulos%")
    exitProcess(0)


}