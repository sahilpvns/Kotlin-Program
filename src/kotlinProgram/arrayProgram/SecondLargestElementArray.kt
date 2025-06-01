package kotlinProgram.arrayProgram


// Program to find Second-largest element in an Array
fun main() {
    val arr = arrayOf(1, 5, 7, 2, 9)
    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE

    for (num in arr) {
        if (num > largest) {
            secondLargest = largest
            largest = num
        } else if (num > secondLargest) {
            secondLargest = num
        }
    }
    println(secondLargest)
}

// Output: 7
