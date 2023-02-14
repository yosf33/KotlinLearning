fun main() {
   val words =  listOf("geek","for","geeks","hello","world")

    val (first,second)= words.partition { it.length > 4 }
    println(first)
    println(second)

}