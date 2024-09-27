package com.sahilpvns.kotlinProgram.stringProgram

// Scope function
fun main(){

    // let
    val str = "Hello"
    str.let {
        println(it)
    }

    // run
    val str1 = "Hello"
    str1.run {
        println(this)
    }

    // with
    val str4 = "Hello"
    with(str4) {
        println(this)
    }

    // apply
    val str2 = "Hello"
    str2.apply {
        println(this)
    }

    // also
    val str3 = "Hello"
    str3.also {
        println(it)
    }


}