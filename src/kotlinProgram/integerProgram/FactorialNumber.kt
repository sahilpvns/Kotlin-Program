package kotlinProgram.integerProgram


// Find the factorial of a number in Kotlin
fun main() {
    val num = 5
    var factorial = 1
    for (i in 1..num) {
        factorial *= i
    }
    println("The factorial of $num is $factorial")
}

// factorial of 5 is 120