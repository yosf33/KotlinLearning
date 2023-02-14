fun main() {
//list filtering
    val list = listOf("geeks", "for", "hello", "world")
    val longerthan4= list.filter { it.length > 4 }
    println(longerthan4)


    val numbersMap = mapOf("key13" to 10, "key25" to 20, "key34" to 30, "key45" to 40, "key55" to 50)
    val endWith5AndvalBiggerThan20=numbersMap.filter { (key,value)-> key.endsWith("5") && value > 20 }
    println(endWith5AndvalBiggerThan20)

    val words = listOf("geek","for","geeks","all","world")
    val filterNot = words.filterNot { it.length <= 3 }
    println(filterNot)

    


}