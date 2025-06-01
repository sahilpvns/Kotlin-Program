package kotlinProgram.integerProgram

fun main() {
    var num = 18
    for (i in 3 downTo 1) {
        for (j in 1..i) {
            print("$num ")
            num -= 3
        }
        println()
    }
}

/*
val rows = 3 // Number of rows in the pyramid
var number = 18 // Starting number

for (i in 0 until rows) {
    // Print leading spaces for alignment
    for (space in 0 until i) {
        print(" ") // Three spaces for alignment
    }

    // Print the numbers in the current row
    for (j in i until rows) {
        print(number.toString().padEnd(3, ' '))
        number -= 3 // Decrement by 3
    }
    println() // Move to the next line
}

*/

/*

18 15 12
9 6
3

*/
