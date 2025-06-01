package kotlinProgram.stringProgram

// Remove white space in string using kotlin
fun main() {
    val input = "  Var ana si "
    val output = input.replace("\\s".toRegex(), "")
    println(output)
}



