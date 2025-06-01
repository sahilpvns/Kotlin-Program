package kotlinProgram.arrayProgram


// Missing number in an array
fun main() {
    val arr = arrayOf(1, 2, 4, 5, 6)
    val n = arr.size + 1
    val expectedSum = n * (n + 1) / 2
    var actualSum = 0
    for (num in arr) {
        actualSum += num
    }
    val missingNumber = expectedSum - actualSum
    println(missingNumber)
}

// 3