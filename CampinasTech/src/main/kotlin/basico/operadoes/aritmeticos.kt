package basico.operadoes

fun main(){
    val(v1, v2, v3, v4)= listOf(3,5,2,15)

    val soma = v1 + v2 + v3 + v4
    val subtracao = v4 - v2
    val divisao = v4 / v1
    val multiplicacao = v2 * v4
    val modulo = v1 % v3

    println("A soma vale: "+ soma)
    println("A subtraçao entre v4 - v2 é: "+ subtracao)
    println("A divisão entre v4 e v1 é: "+ divisao)
    println("A multiplicação entre v2 e v4 é: "+ multiplicacao)
    println("O módulo de v1 e v3 é: "+ modulo)


}