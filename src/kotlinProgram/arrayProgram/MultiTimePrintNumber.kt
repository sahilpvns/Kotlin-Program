package kotlinProgram.arrayProgram

import kotlin.collections.iterator

// find and print numbers that appear multiple times in an array by using a map
fun main() {
    val arr = intArrayOf(2, 3, 4, 2, 2, 6, 4, 3, 2)
    val countMap = mutableMapOf<Int, Int>()

    for (num in arr) {
        countMap[num] = countMap.getOrDefault(num, 0) + 1
    }

    for ((key, value) in countMap) {
        if (value > 1) {
            println("$key appears $value times")
        }
    }
}

/*
2 appears 4 times
3 appears 2 times
4 appears 2 times
*/
