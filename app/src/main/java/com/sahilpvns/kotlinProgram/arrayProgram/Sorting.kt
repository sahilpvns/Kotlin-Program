package com.sahilpvns.kotlinProgram.arrayProgram

// Sorting Array in Kotlin
fun main() {
    val arr = arrayOf(5, 2, 8, 1, 9)
    for (i in 0 until arr.size - 1) {
        for (j in i + 1 until arr.size) {
            if (arr[i] > arr[j]) {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }

        }
    }
    println(arr.contentToString())
}

