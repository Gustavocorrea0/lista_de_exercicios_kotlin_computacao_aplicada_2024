package br.edu.umfg.twoFer

fun main() {
    println("Troca")
    println("Valor A: ")
    var a = readln().toDouble()

    println("Valor B: ")
    var b = readln().toDouble()
    troca(a, b)
}

private fun troca(valorUm: Double, valorDois: Double) {

    var a = valorUm
    var b = valorDois

    println("Valor Inicial: ")
    println("Valor A: $a")
    println("Valor B: $b")

    val g = a
    a = b
    b = g

    println("Valor Trocado: ")
    println("Valor A: $a")
    println("Valor B: $b")
}