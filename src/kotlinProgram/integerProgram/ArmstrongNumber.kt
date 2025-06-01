package kotlinProgram.integerProgram

import kotlin.math.pow


// Check if a number is Armstrong number
fun main() {
    val num = 153
    var temp = num
    var sum = 0
    while (temp > 0) {
        val digit = temp % 10
        sum += digit.toDouble().pow(3.0).toInt()
        temp /= 10
    }
    if (sum == num) println("$num is an Armstrong number") else println("$num is not an Armstrong number")

}

// 153 is an Armstrong number