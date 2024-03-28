package umfg.edu.jediKnight

fun main() {
    println("Soma dos quadrados")

    println("Valor 1")
    var valorUm = readln().toInt()

    println("Valor 2")
    var valorDois = readln().toInt()

    println("Valor 3")
    var valorTres = readln().toInt()

    calculo(valorUm, valorDois, valorTres)

}

private fun calculo(valorUm: Int, valorDois: Int, valorTres: Int) {

    var soma = valorUm + valorDois + valorTres
    var resultado = soma * soma

    println("O quadrado da soma dos valores é $resultado")
}