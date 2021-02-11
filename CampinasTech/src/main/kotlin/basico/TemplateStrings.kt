package basico

fun main(){
    val nome = "Leandro"
    val aprovados = listOf("João", "Claudia", "Pedro")

    var a : Int = 356.dec()
    var b : String = a.toString()

    println("Int: $a")
    println("Primeiro caracterer da string é: ${b.first()}")

    println("Olá ${nome} , usando template strings")
    println("O primeiro colocado e: ${aprovados[0]} ")
}