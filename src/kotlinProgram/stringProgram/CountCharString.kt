package kotlinProgram.stringProgram

import kotlin.text.iterator


// Count character in String
fun main() {
    val str = "Google"
    val charCount = mutableMapOf<Char, Int>()
    for (char in str) {
        if (charCount.containsKey(char)) {
            charCount[char] = charCount[char]!! + 1
        } else {
            charCount[char] = 1
        }
    }
    println(charCount)
}
// {V=1, a=3, r=1, n=1, s=1, i=1}