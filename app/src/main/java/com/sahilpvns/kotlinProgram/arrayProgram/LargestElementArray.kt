package com.sahilpvns.kotlinProgram.arrayProgram

// Program to find largest element in an Array
fun main() {
    val arr = arrayOf(5, 2, 9, 1, 8)
    var largest = arr[0]
    for (i in 1 until arr.size) {
        if (arr[i] > largest) {
            largest = arr[i]
        }
    }
    println(largest)
}
