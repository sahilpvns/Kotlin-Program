package kotlinProgram.arrayProgram

// Third-largest element in an array
fun main() {
    val arr = arrayOf(5, 2, 8, 1, 9)
    var first = Int.MIN_VALUE
    var second = Int.MIN_VALUE
    var third = Int.MIN_VALUE
    for (i in arr) {
        if (i > first) {
            third = second
            second = first
            first = i
        } else if (i > second) {
            third = second
            second = i
        } else if (i > third) {
            third = i
        }
    }
    println(third)
}

// Output: 5