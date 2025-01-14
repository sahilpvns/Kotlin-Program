package com.sahilpvns.kotlinProgram.arrayProgram


// Remove duplicate elements Array in kotlin
fun removeDuplicatesWithSet(arr: IntArray): IntArray {
    val set = arr.toSet()
    return set.toIntArray()
}

fun main() {
    val arr = intArrayOf(1, 1, 2, 2, 3, 4, 4, 5)
    val uniqueArr = removeDuplicatesWithSet(arr)
    println(uniqueArr.joinToString(", "))
}


// output: 1 2 3 4 5