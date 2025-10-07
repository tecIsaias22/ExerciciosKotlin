fun main() {
    println("digite um numero:  ")
    val nu = readLine()!!.toInt()

    if (nu > 1) {
        println("O seu numero $nu e Positivo")
    } else if (nu == 0) {
        println("O seu numero $nu e igual")
    } else
        println("O seu numero $nu e negativo")
}