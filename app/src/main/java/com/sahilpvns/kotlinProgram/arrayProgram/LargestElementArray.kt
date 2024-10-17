package com.sahilpvns.kotlinProgram.arrayProgram

// Program to find largest element in an Array
fun main() {
    val numbers = arrayOf(5, 2, 9, 1, 8)
    var largest = numbers[0]
    for (num in numbers) {
        if (num > largest) {
           largest = num
        }
    }
    println(largest)
}

// Output: 9
