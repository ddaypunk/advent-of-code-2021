package day2

fun main() {
    val course = Course()
    course.plot()
}

class Course {
    private val data = InputData.data
    private val currentPosition = Position()
    private var aim = 0

    fun plot() {
        for (move in data) {
            makeMove(move)
        }

        println(currentPosition.getProduct())
    }

    private fun makeMove(move: String) {
        val (direction, distance) = move.split(" ")
        val units = distance.toInt()

        when(direction.uppercase()) {
            Direction.FORWARD.toString() -> {
                currentPosition.moveForwardBy(units)
                currentPosition.increaseDepthBy(aim * units)
            }
            Direction.DOWN.toString() -> aim += units
            Direction.UP.toString() -> aim -= units
        }
    }

    enum class Direction {
        FORWARD,
        DOWN,
        UP
    }
}

class Position(private var x: Int = 0, private var y: Int = 0) {
    fun moveForwardBy(units: Int) {
        x += units
    }

    fun increaseDepthBy(units: Int) {
        y += units
    }

    fun decreaseDepthBy(units: Int) {
        y -= units
    }

    fun getProduct(): Int {
        return x * y
    }
}