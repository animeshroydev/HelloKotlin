package ClassesObject.decor

class Enums {
    enum class Direction(val degrees: Int) {
        NORTH(0), SOUTH(180), EAST(90), WEST(270)
    }
}

fun main() {
    println(Enums.Direction.EAST.name)
    println(Enums.Direction.EAST.ordinal)
    println(Enums.Direction.EAST.degrees)
}