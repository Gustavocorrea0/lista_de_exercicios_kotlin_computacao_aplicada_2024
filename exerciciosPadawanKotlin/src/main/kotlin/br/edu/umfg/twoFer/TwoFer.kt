package br.edu.umfg.twoFer

fun main() {
    twoFer()
}

private fun twoFer() {
    println("Two-Fer")
    println("Qual é o seu nome ?")
    val nome = readln()

    if (nome.equals(null) || nome.equals("") || nome.equals(" ")) {
        println("Um para você, um para mim")
    } else {
        println("Um para $nome, um para mim")
    }
}