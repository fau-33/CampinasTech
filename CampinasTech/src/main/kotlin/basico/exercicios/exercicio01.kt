package basico.exercicios

fun main(){
    val(v1, v2, v3, v4)= listOf(2, 3, 5, 8)
    val(v5, v6, v7, v8, v9)= listOf(10, 20, 25, 30, 50)

    val e1 = (v1 * v4 + v6 - v1) - ((v8 - v7) + v6)
    val e2 = (v2 *(v2 * v2 * v2)) / (v9 - (v5 / v1 * v4))
    val e3 = (((v1 * v4))/ v2) + (v2 * v4) / (v3 % v2)

    println("O resultado da expressão 1: " + e1)
    println("O resultado de expressão 2: " + e2)
    println("O resultado de expressão 3: " + e3)
}