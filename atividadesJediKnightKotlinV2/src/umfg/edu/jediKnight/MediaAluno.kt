package umfg.edu.jediKnight

fun main() {
    var notaUm: Double
    var notaDois: Double
    var notaTres: Double
    var notaQuatro: Double

    println("+------------------------------------------------+")
    println("|           Calculo de Média escolar             |")
    println("+------------------------------------------------+")

    do {
        println("| > Qual a nota 1 (Minimo 0 e Maximo 10): ")
        notaUm = readln().toDouble()
    } while (notaUm <= 0)
    println("+------------------------------------------------+")
    do {
        println("| > Qual a nota 2 (Minimo 0 e Maximo 10): ")
        notaDois = readln().toDouble()
    } while (notaDois <= 0)
    println("+------------------------------------------------+")
    do {
        println("| > Qual a nota 3 (Minimo 0 e Maximo 10): ")
        notaTres = readln().toDouble()
    } while (notaTres <= 0)
    println("+------------------------------------------------+")
    do {
        println("| > Qual a nota 4 (Minimo 0 e Maximo 10): ")
        notaQuatro = readln().toDouble()
    } while (notaQuatro <= 0)

    calculo(notaUm, notaDois, notaTres, notaQuatro)
}

private fun calculo( notaUm: Double, notaDois: Double, notaTres: Double, notaQuatro: Double) {
    var somaDeNotas = notaUm + notaDois + notaTres + notaQuatro
    var media = somaDeNotas / 4

    if (media >= 5.0) {
        println("+------------------------------------------------+")
        println("| > Média: $media | > Situação: APROVADO")
        println("+------------------------------------------------+")
    } else if (media < 5.0) {
        println("+------------------------------------------------+")
        println("| > Média: $media | Situação: REPROVADO")
        println("+------------------------------------------------+")
    }
}