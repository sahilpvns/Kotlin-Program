package kotlinProgram.stringProgram

// Filter String list containing special char
fun main() {
    val list = listOf("car", "bike", "bus", "train", "truck")
    val filteredList = list.filter { it.contains("i") }
    println(filteredList)

}
