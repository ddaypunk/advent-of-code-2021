package day1

fun main() {
    val dataArray = InputData.data
    println(dataArray)
    val previousWindow:Array<Int> = arrayOf(dataArray[0].toInt(), dataArray[1].toInt(), dataArray[2].toInt())
    var previousTotal = previousWindow.reduce { acc, each -> acc + each }
    println("${previousWindow.contentToString()} = $previousTotal (N/A - no previous sum)")
    var increasedCounter = 0

    for(i in 1..dataArray.size-3) {
        val currentWindow:Array<Int> = arrayOf(dataArray[i].toInt(), dataArray[i+1].toInt(), dataArray[i+2].toInt())
        val currentTotal = currentWindow.reduce { acc, each -> acc + each }
        print("${currentWindow.contentToString()} = $currentTotal ")

        when {
            currentTotal > previousTotal -> {
                increasedCounter++
                print("(increased)\n")
            }
            currentTotal == previousTotal -> {
                print("(no change)\n")
            }
            currentTotal < previousTotal -> {
                print("(decreased)\n")
            }
        }

        previousTotal = currentTotal
    }

    println(increasedCounter)
}