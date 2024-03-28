package br.edu.umfg.twoFer

fun main(){
    println("Calculo de Circunferencia")
    println("Valor do raio em metros")
    var raio = readln().toDouble()

    var pi = 3.14159265

    var valorDaCircunferencia = pi * (raio * raio)

    println("O valor da circunferencia é igual a $valorDaCircunferencia metros")
}