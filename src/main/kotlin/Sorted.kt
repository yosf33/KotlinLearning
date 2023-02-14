fun main() {
    val sortedValues = mutableListOf(1, 2, 3, 4, 6, 5)
    sortedValues.sort()
    println(sortedValues)

    //to sort via map
    val values = mutableListOf(1 to "a", 2 to "b", 7 to "c", 6 to "d", 5 to "c", 6 to "e")
    values.sortByDescending { it.second }//depend on ascending the second element
    println(values)
}