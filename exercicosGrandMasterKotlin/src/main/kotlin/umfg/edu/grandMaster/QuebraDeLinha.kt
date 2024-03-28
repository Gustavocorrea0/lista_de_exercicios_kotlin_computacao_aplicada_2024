package umfg.edu.grandMaster

fun main() {
    capaturaDeInformacoes()
}

private fun capaturaDeInformacoes() {
    println("+------------------------------------+")
    println("|           Quebra de Linha          |")
    println("+------------------------------------+")
    println("| > Frase: ")
    val fraseUsuario = readln()
    println("| > Quantidade de quebras de linha: ")
    val quebraDeLinhasUsuario = readln().toInt()

    executarQuebraLinhas(fraseUsuario, quebraDeLinhasUsuario)
}

private fun executarQuebraLinhas(fraseUsuario: String, quebraDeLinhasUsuario: Int) {
    var linhaAtual = ""

    if (fraseUsuario.isNullOrEmpty()) {
        println("+------------------------------------+")
        println("|       Frase nula ou vazia          |")
        return
    }

    if (quebraDeLinhasUsuario <= 0) {
        println("+------------------------------------+")
        println("|   Quantidade de quebras Inválida   |")
        return
    }

    val palavrasSeparadas = fraseUsuario.split(" ")

    println("+------------------------------------+")

    for (palavra in palavrasSeparadas) {
        if(linhaAtual.isEmpty()) {
            linhaAtual = palavra
        } else if (linhaAtual.length + palavra.length + 1 <= quebraDeLinhasUsuario){
            linhaAtual = linhaAtual + " $palavra"
        } else {
            println(linhaAtual)
            linhaAtual = palavra
        }
    }
    if (linhaAtual.isNotEmpty()){
        println(linhaAtual)
    }
}