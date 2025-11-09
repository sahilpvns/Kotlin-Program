package kotlinProgram.stringProgram

// Find smallest and largest word in the string
fun main() {
    val str = "This is a test string"
    var smallest = ""
    var largest = ""
    val words = str.split(" ")
    for (word in words) {
        // Smallest Number
        if (smallest.isEmpty() || word.length < smallest.length) {
            smallest = word
        }
        // Largest Number
        if (largest.isEmpty() || word.length > largest.length) {
            largest = word
        }
    }
    println(smallest)
    println(largest)
}

// a
// string