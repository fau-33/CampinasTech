package basico.exercicios

import java.util.*


fun main() {

//    Exemplo pedindo nota ao usuario
    println("Digite nota 1: ")
    val nota1 = Scanner(System.`in`).nextInt()

    println("Digite nota 2: ")
    val nota2 = Scanner(System.`in`).nextInt()

    println("Digite nota 3: ")
    val nota3 = Scanner(System.`in`).nextInt()

    val media = (nota1 + nota2 + nota3) / 3
    println("A media do aluno: $media")
}
