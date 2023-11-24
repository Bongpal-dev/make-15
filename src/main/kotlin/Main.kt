

fun main() {

    var number = mutableListOf<Double>(10.0, 15.0, 5.0, 8.0, 7.0)

    val allCase = caseMake(number.toMutableList())



    println("all case : ${allCase.joinToString()}")
    println("all case size : ${allCase.size}")

}