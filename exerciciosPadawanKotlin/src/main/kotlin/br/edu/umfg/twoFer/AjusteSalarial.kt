package br.edu.umfg.twoFer

fun main(){
    calculo()
}

private fun calculo() {
    println("Calculo de Ajuste Salarial")

    println("Valor do salario")
    var valorSalarial = readln().toDouble()

    println("Percentual")
    var percentualDeReajuste = readln().toDouble()

    percentualDeReajuste = (valorSalarial * percentualDeReajuste) / 100

    var novoSalario = valorSalarial + percentualDeReajuste

    println("O novo salario é $novoSalario")
}