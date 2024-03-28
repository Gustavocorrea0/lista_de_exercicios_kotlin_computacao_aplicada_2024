package umfg.edu.jediMaster

fun main() {

    println("+-----------------------------+")
    println("|           JoKenPô           |")
    println("+-----------------------------+")
    println("|        Jogada Player 1      |")
    println("+-----------------------------+")
    println("|         P  - Pedra          |")
    println("|         A  - Papel          |")
    println("|         T  - Tesoura        |")
    println("+-----------------------------+")
    println("| >  Qual a escolha: ")
    var escolhaJogador1 = readln().uppercase()

    limparConsole()

    println("+-----------------------------+")
    println("|        Jogada Player 2      |")
    println("+-----------------------------+")
    println("|         P  - Pedra          |")
    println("|         A  - Papel          |")
    println("|         T  - Tesoura        |")
    println("+-----------------------------+")
    println("| >  Qual a escolha: ")
    var escolhaJogador2 = readln().uppercase()

    jogar(escolhaJogador1, escolhaJogador2)

}

private fun jogar(escolhaJogador1: String, escolhaJogador2: String) {

    if (escolhaJogador1 == escolhaJogador2) {
        println("+-----------------------------+")
        println("|           Empate            |")
        println("+-----------------------------+")
    }

    if (escolhaJogador1.equals("P") && escolhaJogador2.equals("T")
        || escolhaJogador1.equals("T") && escolhaJogador2.equals("A")
        || escolhaJogador1.equals("A") && escolhaJogador2.equals("P")
    ) {
        println("+-----------------------------+")
        println("|       Player 1 venceu       |")
        println("+-----------------------------+")
    }

    if (escolhaJogador2.equals("P") && escolhaJogador1.equals("T")
        || escolhaJogador2.equals("T") && escolhaJogador1.equals("A")
        || escolhaJogador2.equals("A") && escolhaJogador1.equals("P")
    ) {
        println("+-----------------------------+")
        println("|       Player 2 venceu       |")
        println("+-----------------------------+")
    }

}

private fun limparConsole() {
    repeat(100) { println() }
}