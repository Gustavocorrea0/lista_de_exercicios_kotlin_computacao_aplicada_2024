package umfg.edu.jediMaster

fun main(){
    println("Sequencia Finonacci")
    println("Digite um número: ")
    var numero = readln()?.toIntOrNull()

    if (numero != null) {
        println("Finonacci até $numero: ")
        for (i in 0 until numero){
            println(calculoFinonacci(i))
        }
    }
}

private fun calculoFinonacci(numero: Int): Int{
    return if(numero <= 1){
        numero
    } else {
        calculoFinonacci(numero - 1) + calculoFinonacci(numero - 2)
    }
}