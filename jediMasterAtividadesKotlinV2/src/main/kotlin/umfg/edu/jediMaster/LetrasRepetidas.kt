package umfg.edu.jediMaster

import java.lang.Exception

fun main() {
    try {

    } catch (ex: Exception) {
        println("ERRO TIPO: ${ex.printStackTrace()}")
    }
    println("Letras Repetidas")
    println("Digite o texto desejado: ")
    val texto = readln()
    buscarLetra(texto)

    var letraRepetida = buscarLetra(texto)

    if (letraRepetida == null){
        println("Sem letras repetidas")
    } else {
        println("A primeira letra repetida é $letraRepetida")
    }

}

private fun buscarLetra(texto: String): Char? {

    val textos = mutableSetOf<Char>()

    for (letra in texto) {
        if (letra in textos) {
            return letra
        } else {
            textos.add(letra)
        }
    }
    return null
}