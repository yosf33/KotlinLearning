fun main() {
    val words = listOf("geeks","for","geeeks","hello","world")

    println("Any element matches? "+words.any{ it.endsWith("s")})
    println("No element matches? "+words.none{ it.endsWith("a")})
    println("All element matches? "+words.all{ it.endsWith("d")})

    //is it empty or have at least one:
    println(words.any())
    println(words.none())

}