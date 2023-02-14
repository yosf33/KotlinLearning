fun main() {
    //by position
    createUser(111, "youssef", 21, null, null)
    
    //by names
    createUser(
        userName = "youssef",
        userAge = 21,
        city = null,
        country = null,
        userId = 211
    )


}

fun createUser(userId: Int, userName: String, userAge: Int, country: String?, city: String?) {
    display(userName)
}

fun display(text: String) {
    println(text)
}