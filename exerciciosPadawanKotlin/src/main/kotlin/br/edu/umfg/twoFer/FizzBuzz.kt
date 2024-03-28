package br.edu.umfg.twoFer

fun main(){
    println("FizzBuzz")
    println("Digite o número")
    var numero = readln().toInt()
    fizzBuzz(numero)
}

private fun fizzBuzz(numero: Int) {
    if (numero % 3 == 0 && numero % 5 == 0) {
        println("FizzBuzz")
    } else if (numero % 5 == 0) {
        println("Buzz")
    } else if (numero % 3 == 0) {
        println("Fizz")
    } else {
        println("O valor $numero não é divisivel por 3 e por 5")
    }
}