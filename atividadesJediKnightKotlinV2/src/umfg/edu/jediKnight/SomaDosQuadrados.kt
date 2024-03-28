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

    var valorUm1 = valorUm * valorUm
    var valorDois1 = valorDois * valorDois
    var valorTres1 = valorTres * valorTres

    var resultado = valorUm1 + valorDois1 + valorTres1

    println("A soma dos valores ao quadrado é $resultado")
}