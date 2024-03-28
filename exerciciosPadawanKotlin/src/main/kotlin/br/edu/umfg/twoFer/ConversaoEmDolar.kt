package br.edu.umfg.twoFer

fun main(){
    println("Conversão de valor em real")
    println("Qual é a cotação do dolar: ")
    var cotacaoDoDolar = readln().toDouble()
    println("Qual é o valor em real: ")
    var valorReal = readln().toDouble()

    var valor = valorReal / cotacaoDoDolar

    println("Valor convertido $valor")
}