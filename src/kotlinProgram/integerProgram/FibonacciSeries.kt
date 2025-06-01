package kotlinProgram.integerProgram

// Fibonacci Series
fun main() {
    val n = 10
    var t1 = 0
    var t2 = 1
    for (i in 1..n) {
        val sum = t1 + t2
        t1 = t2
        t2 = sum

        print("$t1 + ")
    }
}

// First 10 terms: 0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 +
