package umfg.edu.jediKnight

fun main() {
    println("Calculo de velocidade do Projétil")
    println()

    var distaciaProjetil: Double
    var tempoProjetil: Double

    do {
        println("Qual a distancia percorrida (em metros): ")
        distaciaProjetil = readln().toDouble()
    } while (distaciaProjetil < 0)

    do {
        println("Qual o tempo para atingir o alvo (em segundos)")
        tempoProjetil = readln().toDouble()
    } while (tempoProjetil < 0)

    calculoDeVelocidade(distaciaProjetil, tempoProjetil)
}

private fun calculoDeVelocidade(distacia: Double, tempo: Double) {

    var velocidadeDoProjetil = (distacia * 1000) / (tempo * 60)

    println(velocidadeDoProjetil)
}