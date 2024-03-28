package umfg.edu.jediKnight

fun main() {
    println("+------------------------------------------------+")
    println("|               Calculo de Fatorial              |")
    println("+------------------------------------------------+")
    println("| > Digite um número para calcular o fatorial:")
    var numero = readln().toInt()

    if (numero < 0) {
        println("+------------------------------------------------+")
        println("|              O numero é negativo               |")
        println("+------------------------------------------------+")
        return
    }

    println("+------------------------------------------------------+")
    println("| > O fatorial de $numero é ${calcularFatorial(numero)}")
    println("+------------------------------------------------------+")
}

fun calcularFatorial(numero: Int): Long {
    var resultado = 1L
    for (i in 1..numero) {
        resultado *= i
    }
    return resultado
}