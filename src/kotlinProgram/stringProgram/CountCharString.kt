package kotlinProgram.stringProgram

import kotlin.text.iterator


// Count character in String
fun main() {

    val name = "Varanasi"
    val charCountMap = mutableMapOf<Char, Int>()

    for (ch in name) {
        charCountMap[ch] = charCountMap.getOrDefault(ch, 0) + 1
    }

    for ((char, count) in charCountMap) {
        println("$char -> $count")
    }
}

// {V=1, a=3, r=1, n=1, s=1, i=1}