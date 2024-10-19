package com.sahilpvns.kotlinProgram.arrayProgram


// Remove duplicate elements Array in kotlin
fun main() {
    val arr = intArrayOf(1, 1, 2, 2, 3, 4, 4, 5)
    var j = 0
    for (i in 0 until arr.size - 1) {
        if (arr[i] != arr[i + 1]) {
            arr[j++] = arr[i]
        }
    }
    arr[j++] = arr[arr.size - 1]
    for (i in 0 until j) {
        print("${arr[i]} ")
    }
}