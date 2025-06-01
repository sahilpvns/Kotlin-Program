package kotlinProgram.stringProgram

//Remove Vowel in String
fun main(){
    val str = "Google"
    val remove = "aeiouAEIOU"
    val result = str.filter { it !in remove }
    //  val result = str.replace("l","")
    //  val result = str.filter { it != 'l' }
    println(result)
}

// Ggl