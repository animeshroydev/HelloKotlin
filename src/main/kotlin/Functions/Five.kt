package Functions

// Lambdas and higher order function

/*
var dirtyLevel = 20
 val waterFilter = { dirty : Int -> dirty / 2}
 println(waterFilter(dirtyLevel))
This is in experiment stage. It may be slow or unstable. Please, report problems to http://kotl.in/issue.
Welcome to Kotlin version 1.7.10-release-334 (JRE 11.0.16+11-LTS-199)
Type :help for help, :quit for quit
10

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
     return operation(dirty)
 }

val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
 println(updateDirty(30, waterFilter))
15
 */