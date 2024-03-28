package br.edu.umfg.twoFer

fun main() {
    println("Soma de pares")
    println("Primeiro número: ")
    val num1 = readLine()!!.toInt()

    println("Segundo Número: ")
    val num2 = readLine()!!.toInt()

    var sum = 0
    for (i in num1..num2) {
        if (i % 2 == 0) {
            sum += i
        }
    }

    println("A soma dos pares entre $num1 e $num2 é: $sum")
}