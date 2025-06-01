package kotlinProgram.arrayProgram

// sum of array without using inbuilt function
fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    var sum = 0
    for (num in arr) {
        sum += num
    }
    println("The sum of the array is: $sum")
}

// The sum of the array is: 15