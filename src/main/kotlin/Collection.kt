fun main() {
    /**
     * to make immutable collection:
     */
    val immutableList = listOf("youssef", "soliman", "ibram", "youssef")
//    immutableList.add="ali"
    for (i in immutableList) {
//        println(i)
    }

    val immutableSet = setOf(6, 6, 9, "youssef", "ibram", "youssef")
    for (i in immutableSet) {
//        println(i)
    }

    val immutableMap = mapOf(9 to "youssef", 10 to "ibram", 20 to "Abo Awad")
    for (i in immutableMap.keys) {
//        println(immutableMap[i])
    }

    /**
     * mutable collection:
     */

    var mutableList = mutableListOf<String>("youssef","ibram","Soliman","youssef")
    mutableList[0] = "mam"
    mutableList.add("anyone")
    for (i in mutableList) {
//        println(i)
    }

    var mutableSet = mutableSetOf<String>("youssef", "ibram", "youssef", "soliman")
    mutableSet.remove("youssef")
    mutableSet.add("anyone")
    for (i in mutableSet) {
//        println(i)
    }

    var mutableMap = mutableMapOf<Int, String>(10 to "youssef", 20 to "Soliman", 100 to "ibram")
    mutableMap.remove(10)
    mutableMap.put(300, "mam")
    for (i in mutableMap.keys) {
        println(mutableMap[i])
    }

}