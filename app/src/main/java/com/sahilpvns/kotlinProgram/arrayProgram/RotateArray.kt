package com.sahilpvns.kotlinProgram.arrayProgram


// Rotate an array
fun main() {
    val originalArray = intArrayOf(1, 2, 3, 4, 5)
    val k = 2
    val rotatedArray = rotateArray(originalArray, k)

    println("Original Array: ${originalArray.joinToString(", ")}")
    println("Rotated Array: ${rotatedArray.joinToString(", ")}")
}

fun rotateArray(arr: IntArray, k: Int): IntArray {
    val n = arr.size
    val rotationCount = k % n
    val rotatedArray = IntArray(n)

    for (i in arr.indices) {
        rotatedArray[(i - rotationCount + n) % n] = arr[i]
       // rotatedArray[(i + rotationCount) % n] = arr[i]  // rotate in right side
    }
    return rotatedArray
}



