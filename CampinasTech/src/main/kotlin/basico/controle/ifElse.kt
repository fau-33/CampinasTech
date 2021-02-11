package basico.controle

fun main(){
    val nota: Double = 6.0

    val resultado = if(nota >= 7){
        "passou"
    }else if (nota >= 5 && nota < 7){
        "Recuperação"
    }else{
        "Não passou"
    }

    println(resultado)
}