package br.edu.umfg.twoFer

fun main(){
    println("Calculo de salario liquido de um Professor")
    println("Valor da Hora aula")
    var valorDaHoraAula = readln().toDouble()

    println("Valor da Hora aula")
    var quantidadeDeHorasAula = readln().toInt()

    println("Percentual de desconto")
    var percentualDeDesconto = readln().toInt()

    var salarioBruto = valorDaHoraAula * quantidadeDeHorasAula
    var totalDeDesconto = (salarioBruto * percentualDeDesconto) / 100
    var salarioLiquido = salarioBruto - totalDeDesconto

    println("Salario bruto: $salarioBruto")
    println("Salario líquido: $salarioLiquido")
}