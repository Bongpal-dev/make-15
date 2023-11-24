fun caseMake(caseNumber: MutableList<Double>): MutableList<MutableList<Double>>{

    var makeAllCase = mutableListOf<MutableList<Double>>()
    var nowCase = mutableListOf<Double>()

    caseNumber.sort()

    for (i in 0 until caseNumber.size){
        for (j in 0 until caseNumber.size) {
            if (j != i) {
                for (k in 0 until caseNumber.size) {
                    if (k != i && k != j) {
                        for (l in 0 until caseNumber.size ) {
                            if (l != i && l != j && l != k) {
                                for (m in 0 until caseNumber.size) {
                                    if(m != i && m != j && m != k && m != l) {
                                        nowCase += caseNumber[i]
                                        nowCase += caseNumber[j]
                                        nowCase += caseNumber[k]
                                        nowCase += caseNumber[l]
                                        nowCase += caseNumber[m]
                                        makeAllCase += nowCase.toMutableList()
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

    return makeAllCase.toMutableList()

}