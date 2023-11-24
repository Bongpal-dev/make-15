

fun main() {

    var number = mutableListOf<Double>()

    while (number.size < 5) {
        number += readLine()!!.toDouble()
    }

    val allCase = caseMake(number.toMutableList())

    val ans = Calcul(allCase)

    println("사용숫자 : ${number.joinToString{it.toInt().toString()}}")

    if (ans.fifteenChecker) {
        println("15만들 수 있지롱")
        println(ans.answer.joinToString("\n"))
    } else {
        println("이건 안되넹~")
    }



}