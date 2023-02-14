fun main() {
    val myFriend = listOf("Ali", "Ahmed", "Ameer", "Haytham", "Zaid")
    print(compactGetFriendsNamesStartWith(myFriend,'A'))
}


fun getFriendDetails(listOfFriends: List<String>): String {
    return "you have ${listOfFriends.size} friend"
}
//region passing list
//filter and get only friends that's there names start with a specific character
fun getFriendsNamesStartWith(listOfFriends: List<String>, firstChar: Char): List<String> {
//    val filteredList = mutableListOf<String>()
    //first code
//    for (i in 0 until listOfFriends.size) {
//        if (listOfFriends[i].get(0) == firstChar) {
//            filteredList.add(listOfFriends[i])
//        }
//    }
    //first modification
//    for (friend in listOfFriends) {
//        if (friend.get(0) == firstChar) {
//            filteredList.add(friend)
//        }
//    }
    //second modification
//    listOfFriends.forEach{
//        if (it.get(0) == firstChar) {
//            filteredList.add(it)
//        }
//    }

//third modification
    return listOfFriends.filter { it.get(0)==firstChar }
}
//endregion

fun compactGetFriendsNamesStartWith(listOfFriends: List<String>, firstChar: Char)
                                        = listOfFriends.filter { it[0] ==firstChar }
