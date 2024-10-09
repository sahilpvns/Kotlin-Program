package com.sahilpvns.kotlinProgram.arrayProgram


// Program to find Second largest element in an Array
fun main() {
    val arr = arrayOf(5, 2, 8, 1, 9)
    var largest = arr[0]
    var secondLargest = arr[0]

    for (i in 1 until arr.size) {
        if (arr[i] > largest) {
            secondLargest = largest
            largest = arr[i]
        } else if (arr[i] > secondLargest && arr[i] != largest) {
            secondLargest = arr[i]
        }
    }
    println(secondLargest)
}
// Output: 9