package kotlinProgram.integerProgram


// Reverse Integer in Kotlin
fun main() {
    val num = 12345
    var reversed = 0
    var temp = num
    while (temp != 0) {
        val digit = temp % 10
        reversed = reversed * 10 + digit
        temp /= 10
    }
    println("Reversed number: $reversed")
}

// Reversed number: 54321
