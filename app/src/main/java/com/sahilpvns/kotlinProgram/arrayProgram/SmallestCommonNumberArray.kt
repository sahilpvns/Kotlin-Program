package com.sahilpvns.kotlinProgram.arrayProgram

// Smallest Common Number in array list
fun main() {
    val arrays = listOf(listOf(1, 2, 3), listOf(2, 3, 4), listOf(3, 4, 5))
    val smallestCommonNumber = findSmallestCommonNumber(arrays)
    println(smallestCommonNumber)
}

fun findSmallestCommonNumber(arrays: List<List<Int>>): Int? {
    if (arrays.isEmpty()) return null
    val sortedArrays = arrays.map { it.sorted() }
    val firstArray = sortedArrays[0]
    for (num in firstArray) {
        if (sortedArrays.all { num in it }) {
            return num
        }
    }
    return null
}