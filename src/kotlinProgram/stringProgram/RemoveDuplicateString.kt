package kotlinProgram.stringProgram


//Remove Duplicate character from String
fun main() {
    val str = "Google"
    var newStr = ""
    for (i in str.indices) {
        if (str[i] !in newStr) {
            newStr += str[i]
        }
    }
    println(newStr)
}

// Gogle

