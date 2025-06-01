package kotlinProgram.arrayProgram

// Program to find the largest element in an Array
fun main() {
    val numbers = arrayOf(5, 2, 9, 1, 8)
    var largest = numbers[0]
    for (i in numbers) {
        if (i > largest) {
           largest = i
        }
    }
    println(largest)
}

// Output: 9
