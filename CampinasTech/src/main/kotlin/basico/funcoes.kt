package basico

fun main(){
    somaDoisNumeros1(a = 3, b = 5)
    somaDoisNumeros2(a = 3)

}
//Função sem retorno
fun somaDoisNumeros1(a: Int, b: Int){
    println("A soma de a e b = "+ (a+b))
}

//Função sem retorno
fun somaDoisNumeros2(a: Int, b: Int = 1){
    println("A soma de a e b = "+ (a+b))
}

