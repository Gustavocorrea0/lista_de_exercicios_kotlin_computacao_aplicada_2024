package umfg.edu.grandMaster

fun main() {
    println("Separação de Proteina")

    var rna = "a"
    do {
        println("Qual é o RNA")
        rna = readln()
    } while (rna.length % 3 != 0 && rna.isNullOrEmpty())

    var codons = separacaoDeCodons(rna)
    var proteina = conversao(codons)

    println("A sequencia de proteinas é: $proteina")
}

fun separacaoDeCodons(rna: String): List<String> {
    val tamanhoCodons = 3
    val codons = mutableListOf<String>()
    for (i in 0 until rna.length step tamanhoCodons) {
        codons.add(rna.substring(i, i + tamanhoCodons))
    }
    return codons
}

fun conversao(codons: List<String>): List<String> {
    val mapaDeAminoacidos = mapOf(
        "AUG" to "Metionina", "UUU" to "Fenilalanina",
        "UUC" to "Fenilalanina", "UUA" to "Leucina",
        "UUG" to "Leucina", "UCU" to "Serina",
        "UCC" to "Serina", "UCA" to "Serina", "UCG" to "Serina",
        "UAU" to "Tirosina", "UAC" to "Tirosina",
        "UGU" to "Cisteína", "UGC" to "Cisteína",
        "UGG" to "Triptofano"
    )

    val proteina = mutableListOf<String>()
    for (codon in codons) {
        if (mapaDeAminoacidos.containsKey(codon)) {
            val aminoAcid = mapaDeAminoacidos[codon]
            proteina.add(aminoAcid!!)
        } else {
            break
        }
    }

    return proteina
}
