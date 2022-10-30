package Functions

// Filters and lazy filters
val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

fun main() {

    // decorations that start with the letter p.
    println(decorations.filter {it[0] == 'p'})

    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")

    // lazy, will wait until asked to evaluate
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    // force evaluation of the lazy list
    val newList = filtered.toList()
    println("new list: $newList")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }
}