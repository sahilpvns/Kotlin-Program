package kotlinProgram

// print 2nd Highest from list(10, 20, 5, 40, 30)
fun main() {
    val numArray = listOf(10, 20, 5, 40, 30)

    val sortArrayNum = numArray.distinct().sortedDescending()[1]
    println(sortArrayNum)
}
