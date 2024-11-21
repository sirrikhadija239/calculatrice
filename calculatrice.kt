fun main(){
    println("welcome to jijis calcultrice")
    println("donner a")
    val a= readln().toInt()
    println("donner b")
    val b = readln().toInt()
    println("donner operation (+ , - , /)")
    val operation = readln()
    var result = when(operation){
        "+" -> a + b
        "-" -> a-b
        "*" -> a*b
        "/" -> if (b!=0) a/b else ("operation invalide")
        else -> "false operation"
    }
    println("le resultat c est $result")


}
