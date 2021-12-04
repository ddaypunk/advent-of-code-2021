package day3

import kotlin.text.StringBuilder

fun main() {
    val data = InputData.data
    findPowerConsumption(data)
    findLifeSupportRating(data)
}

fun findPowerConsumption(data: List<String>) {
    val gammaRating = findGammaRating(data)
    val epsilonRating = findEpsilonRating(data)

    val powerConsumption = Integer.parseInt(gammaRating, 2) * Integer.parseInt(epsilonRating, 2)

    println("Power consumption = $powerConsumption")
}

fun findGammaRating(data: List<String>): String {
    val gammaBuilder = StringBuilder()

    for (i in 0 until data[0].length) {
        val isolatedDigits = data.map { it[i] }

        if (isolatedDigits.count { it == '0' } > isolatedDigits.count { it == '1' }) {
            gammaBuilder.append('0')
        } else {
            gammaBuilder.append('1')
        }
    }

    return gammaBuilder.toString()
}

fun findEpsilonRating(data: List<String>): String {
    val epsilonBuilder = StringBuilder()

    for (i in 0 until data[0].length) {
        val isolatedDigits = data.map { it[i] }

        if (isolatedDigits.count { it == '0' } > isolatedDigits.count { it == '1' }) {
            epsilonBuilder.append('1')
        } else {
            epsilonBuilder.append('0')
        }
    }

    return epsilonBuilder.toString()
}

fun findLifeSupportRating(data: List<String>) {
    val oxygenGeneratorRating = findOxygenGeneratorRating(data)
    val scrubberRating = findCO2ScrubberRating(data)

    val lifeSupportRating = Integer.parseInt(oxygenGeneratorRating, 2) * Integer.parseInt(scrubberRating, 2)

    println("Life Support Rating = $lifeSupportRating")
}

fun findOxygenGeneratorRating(data: List<String>): String {
    val copy:MutableList<String> = data.toMutableList()

    while (copy.size > 1) {
        for (i in 0 until copy[0].length) {
            val isolatedDigits = copy.map { it[i] }

            if (isolatedDigits.count { it == '0' } > isolatedDigits.count { it == '1' }) {
                copy.removeIf { it[i] == '1' }
            } else if (isolatedDigits.count { it == '0' } == isolatedDigits.count { it == '1' }){
                copy.removeIf { it[i] == '0' }
                break
            } else {
                copy.removeIf { it[i] == '0' }
            }
        }
    }

    return copy[0]
}

fun findCO2ScrubberRating(data: List<String>): String {
    val copy:MutableList<String> = data.toMutableList()

    while (copy.size > 1) {
        for (i in 0 until copy[0].length) {
            val isolatedDigits = copy.map { it[i] }

            if (isolatedDigits.count { it == '0' } < isolatedDigits.count { it == '1' }) {
                copy.removeIf { it[i] == '1' }
            } else if (isolatedDigits.count { it == '0' } == isolatedDigits.count { it == '1' }) {
                copy.removeIf { it[i] == '1' }
                break
            } else {
                copy.removeIf { it[i] == '0' }
            }
        }
    }

    return copy[0]
}
