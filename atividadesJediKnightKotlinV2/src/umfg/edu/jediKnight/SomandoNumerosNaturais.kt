package umfg.edu.jediKnight

var primeiroNumero: Int = 0
var ultimoNumero: Int = 0
var resultado: Int = 0

fun main() {
    resultadoFinal()
}

private fun resultadoFinal() {
    primeiroNumero = 1
    ultimoNumero = 100
    resultado = 0

    for (i in primeiroNumero..ultimoNumero) {
        resultado = resultado + i
    }

    println("O primeiro numero é $primeiroNumero e o ultimo numero é $ultimoNumero")
    println("O resultado é $resultado")
}