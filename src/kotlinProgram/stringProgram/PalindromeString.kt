package kotlinProgram.stringProgram

// Check if a String is Palindrome in Kotlin
fun main() {
    val str = "madam"
    var rev = ""
    for (i in str.length - 1 downTo 0) {
        rev += str[i]
    }
    if (str == rev) {
        println("$str is a palindrome")
    } else {
        println("$str is not a palindrome")
    }
}

// madam is a palindrome