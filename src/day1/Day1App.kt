package day1

fun main() {
    val sonar = Sonar(InputData.data)
    sonar.print()
    sonar.calculateIncreases()
}

class Sonar(private val data: List<String>) {
    var counter = 0

    fun calculateIncreases() {
        val windows = generateWindows()
        var previousWindow = windows[0] // initialize with the first data window

        printComparison(null, previousWindow)

        for(i in 1 until windows.size) {
            val currentWindow = windows[i]
            printComparison(currentWindow, previousWindow)

            previousWindow = currentWindow
        }

        println("\nTotal increases: $counter")
    }

    private fun printComparison(currentWindow: Window?, previousWindow: Window) {

        when {
            currentWindow == null -> {
                print("${previousWindow.printable} = ${previousWindow.total} (N/A - no previous sum)\n")
            }
            currentWindow.total > previousWindow.total -> {
                counter++
                print("${currentWindow.printable} = ${currentWindow.total} (increased)\n")
            }
            currentWindow.total == previousWindow.total -> {
                print("${currentWindow.printable} = ${currentWindow.total} (no change)\n")
            }
            currentWindow.total < previousWindow.total -> {
                print("${currentWindow.printable} = ${currentWindow.total} (decreased)\n")
            }
        }
    }

    private fun generateWindows(): List<Window> {
        val windows: ArrayList<Window> = arrayListOf()

        for(i in 0..data.size-3) {
            windows.add(
                Window(arrayOf(data[i].toInt(), data[i+1].toInt(), data[i+2].toInt()))
            )
        }

        return windows
    }

    fun print() = println(data)

}

class Window(depths: Array<Int>) {
    val total: Int = depths.reduce { acc, each -> acc + each }
    val printable: String = depths.contentToString()
}