package umfg.edu.jediMaster

fun main() {
    var valorTotal: Double = 0.0
    var valorPago: Double = 0.0

    println("Valor do Troco")
    do {
        println("+---------------------------------+")
        println("| > Valor Total:")
        valorTotal = readLine()!!.toDouble()
    } while (valorTotal < 0.0)

    do {
        println("+---------------------------------+")
        println("| > Valor Pago:")
        valorPago = readLine()!!.toDouble()
    } while (valorPago < 0.0)

    if (valorPago < valorTotal) {
        println("+---------------------------------+")
        println("|      Valor pago insuficiente    |")
        println("+---------------------------------+")
        return
    }

    calculoTroco(valorPago, valorTotal)
}

private fun calculoTroco(valorPago: Double, valorTotal: Double) {

    var troco = valorPago - valorTotal

    println("+---------------------------------+")
    println("| O troco é:")

    val cedulas = listOf(100, 50, 10, 5, 1)
    val moedas = listOf(0.5, 0.1, 0.05, 0.01)

    for (cedula in cedulas) {
        val quantidadeCedula = (troco / cedula).toInt()
        troco %= cedula
        if (quantidadeCedula > 0)
            println("| > $quantidadeCedula cédula de R$$cedula")
    }

    for (moeda in moedas) {
        val quantidadeMoeda = (troco / moeda).toInt()
        troco %= moeda
        if (quantidadeMoeda > 0)
            println("| > $quantidadeMoeda moeda de R$${"%.2f".format(moeda)}")
    }
}
