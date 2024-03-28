package umfg.edu.jediKnight

var numerosDoArray = 12
var array = IntArray(numerosDoArray)

fun main() {

    println("+------------------------------------------------+")
    println("|            Ordenando Numeros Inteiros          |")
    for (i in 0 until numerosDoArray) {
        println("+------------------------------------------------+")
        println("|  > Digite os números:")
        array[i] = readLine()!!.toInt()
    }

    val arrayEmOrdemDecrecente = array.sortedArrayDescending()

    println("+------------------------------------------------+")
    println("| Numeros em ordem decrecente: ")
    for (a in arrayEmOrdemDecrecente){
        println("$a")
    }
}