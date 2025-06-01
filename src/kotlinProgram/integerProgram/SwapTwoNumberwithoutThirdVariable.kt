package kotlinProgram.integerProgram


// Swap two numbers without using a temporary variable in Kotlin
fun main() {
    var a = 10
    var b = 20

    a = a + b // a = 30
    b = a - b // b = 10
    a = a - b // a = 20
    println("$a, $b")
}

// a = 10, b = 20
// a = 20, b = 10

// a = b.also { b = a }

