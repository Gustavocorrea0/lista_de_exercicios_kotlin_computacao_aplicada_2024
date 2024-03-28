package br.edu.umfg.twoFer

fun main(){
    println("Calculo de Volume de caixa")
    println("Qual é o comprimento da caixa: ")
    var comprimento = readln().toDouble()

    println("Qual é a largura da caixa: ")
    var largura = readln().toDouble()

    println("Qual é a altura da caixa: ")
    var altura = readln().toDouble()

    var volume = comprimento * largura * altura

    println("O volume da caixa é $volume")
}