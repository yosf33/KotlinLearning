fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
    val firstOdd = numbers.find { it % 2 != 0 }
    val lastEven = numbers.findLast { it % 2 == 0 }

    println(firstOdd) 
    println(lastEven)
}