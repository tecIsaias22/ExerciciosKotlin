fun main(){
    print("digite o primeiro numero: ")
    val nu = readLine()!!.toDouble()

    print("digite o sugendo numero: ")
    val nu1 = readLine()!!.toDouble()

    val soma = (nu + nu1)
    println ("A Soma é: $soma")

    val subtracao = (nu - nu1)
    println ("A Subtracao é: $subtracao")

    val multiplicacao = (nu * nu1)
    println ("A Multiplicacao é: $multiplicacao")

    val divisao = (nu / nu1)
    println ("A Divisao é: $divisao")

}