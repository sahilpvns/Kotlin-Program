package com.sahilpvns.kotlinProgram.stringProgram

// "Helloworld" remove "l" char in kotlin
fun main() {
    val str = "Helloworld"
    //val result = str.replace("l","")
    val result = str.filter { it != 'l' }
    println(result)
}

// Heoword

