package com.sahilpvns.kotlinProgram.arrayProgram

// Program to find Smallest element in an Array
fun main() {
    val arr = arrayOf(5, 2, 8, 1, 9)
    var smallest = arr[0]
    for (i in 1 until arr.size) {
        if (arr[i] < smallest) {
            smallest = arr[i]
        }
    }
    println(smallest)

}

// Output: 1