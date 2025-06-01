package kotlinProgram.stringProgram

// Find smallest and largest word in the string
fun main() {
    val str = "This is a test string"
    var smallest = ""
    var largest = ""
    val words = str.split(" ")
    for (word in words) {
        if (smallest.isEmpty() || word.length < smallest.length) {
            smallest = word
        }
        if (largest.isEmpty() || word.length > largest.length) {
            largest = word
        }
    }
    println("Smallest word: $smallest")
    println("Largest word: $largest")
}

// Smallest word: a
// Largest word: string