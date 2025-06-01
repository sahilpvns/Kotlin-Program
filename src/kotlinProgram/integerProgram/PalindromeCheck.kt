package kotlinProgram.integerProgram

// Check if a number is Palindrome in Kotlin
fun main() {
    val num = 12321
    var temp = num
    var rev = 0
    while (temp > 0) {
        val rem = temp % 10
        rev = rev * 10 + rem
        temp /= 10
    }
    if (num == rev) {
        println("Palindrome")
    } else {
        println("Not a Palindrome")
    }

}

// Palindrome
