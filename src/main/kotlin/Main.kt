

fun main() {

    var caseNumber = mutableListOf<Double>()
    var allCase = mutableListOf<MutableList<Double>>()
    var nowCase = mutableListOf<Double>()
    var range = 0 until caseNumber.size

    while (caseNumber.size < 5) {
        caseNumber += readLine()!!.toDouble()
    }

    caseNumber.sort()

    for (i in range){
        for (j in range) {
            if (j != i) {
                for (k in range) {
                    if (k != i && k != j) {
                        for (l in range ) {
                            if (l != i && l != j && l != k) {
                                for (m in range) {
                                    if(m != i && m != j && m != k && m != l) {
                                        nowCase += caseNumber[i]
                                        nowCase += caseNumber[j]
                                        nowCase += caseNumber[k]
                                        nowCase += caseNumber[l]
                                        nowCase += caseNumber[m]
                                        allCase += nowCase.toMutableList()
                                        nowCase.clear()
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    println("all case : ${allCase.joinToString()}")

}