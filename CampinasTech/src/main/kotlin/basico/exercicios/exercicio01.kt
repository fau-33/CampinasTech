package basico.exercicios

fun main(){
    val(v1, v2, v3, v4)= listOf(1, 3, 5, 8)
    val(v5, v6, v7, v8, v9)= listOf(10, 20, 25, 30, 50)

    val e1 = (v1 * v4 + v6 - v1) - ((v8 - v7) + v6)

    println(e1)
}