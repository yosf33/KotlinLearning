fun main() {
    val friendNamesList: MutableList<String> = mutableListOf("Ahmed", "Ali", "Zahraa")
    friendNamesList[0] = "Saif"//we add to the mutable list without change immutable variable

    var friend= mutableListOf<String>("Ahmed","Ali")
    friend= mutableListOf("Zahraa","Noha")//we changed the variable friend
    friendNamesList.add(0, "youssef")
    println(friendNamesList)

    /*
    val friendNames can't be equal any thing
    but the kind of list can be changeable
    we can change the list details without change the val
    list is immutable list
    mutable list
    arrayOf:fixed length; listOf:mutable,immutable changeable length
     */

}