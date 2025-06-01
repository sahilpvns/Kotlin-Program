package kotlinProgram.integerProgram


// Find sum of integer number
fun main() {
    val num = 12345
    var sum = 0
    var temp = num
    while (temp > 0) {
        val digit = temp % 10
        sum += digit
        temp /= 10
    }
    println("The sum of the digits is: $sum")
}
// The sum of the digits is: 15
