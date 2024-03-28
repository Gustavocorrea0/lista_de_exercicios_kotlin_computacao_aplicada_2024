package umfg.edu.jediMaster

var alfabeto: String = "abcdefghijklmnopqrstuvwxyz"
var validaPangrama: Boolean = false

 fun main() {
     println("+---------------------------+")
     println("|          Pangrama         |")
     println("+---------------------------+")
     println("| > Digite a frase")
     val frase = readln().toLowerCase()
     validacaoDePangrama(frase)
 }

private fun validacaoDePangrama(frase: String){

    validaPangrama = true
    val letrasPresentes = mutableSetOf<Char>()

    for (a in alfabeto) {
        if(a in letrasPresentes){
            letrasPresentes.add(a)
        }
    }

    if (letrasPresentes.size == 26) {
        println("A frase é um pangrama.")
    } else {
        println("A frase não é um pangrama.")
    }
}