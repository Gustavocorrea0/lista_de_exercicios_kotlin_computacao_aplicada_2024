package umfg.edu.jediMaster

fun main() {
    println("Anagrama")
    println("| > Primeira Palavra: ")
    val primeiraPalavra = readln()

    println("| > Segunda Palavra: ")
    val segundaPalavra = readln()

    verificarPalavras(primeiraPalavra, segundaPalavra)
}

private fun verificarPalavras(palavraUm: String, palavraDois: String) {

    var palavraUmSemEspaco = palavraUm.replace("\\s".toRegex(), "")
    var palavraDoisSemEspaco = palavraDois.replace("\\s".toRegex(), "")

    var ordemDeLetrasPalavraUm = contarLetras(palavraUmSemEspaco)
    var ordemDeLetrasPalavraDois = contarLetras(palavraUmSemEspaco)

    if (ordemDeLetrasPalavraUm == ordemDeLetrasPalavraDois) {
        println("As palavras são um anagrama")
    } else {
        println("As palavras não são um anagrama")
    }
}

private fun contarLetras(palavra: String): Map<Char, Int> {
    val ordemDeLetras = mutableMapOf<Char, Int>()

    for (letra in palavra){
        ordemDeLetras[letra] = ordemDeLetras.getOrDefault(letra, 0) + 1
    }

    return ordemDeLetras
}
