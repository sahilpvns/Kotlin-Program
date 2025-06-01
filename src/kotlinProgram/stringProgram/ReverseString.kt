package kotlinProgram.stringProgram

// Reverse String
fun main() {
    val str = "Google"
    var reverse = ""
    for (i in str.length - 1 downTo 0) {
        reverse += str[i]
    }
    println(reverse)
}

// elgooG


