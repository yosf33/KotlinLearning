class User1(private val username: String, private val email: String, private val password: String) {

    operator fun component1(): String = username
    operator fun component2(): String = email
    operator fun component3(): String = password
}

data class User2(val username: String, val email: String, val password: String)

fun main() {
/*
to use the declaration we need data class or
make the component functions
 */
    val (username, email, password) = User1("Admin", "user@exvar.com", "12345")
    val (username2, email2, password2) = User2("Admin", "user@exvar.com", "12345")


    /*
    we can use this in lists too
     */
    val fruits = listOf("orange", "apple", "banana")
    val (firstFruit, secondFruit, thirdFruit) = fruits

//    print("the three fruits is : $firstFruit - $secondFruit - $thirdFruit")
    /*

     */
    val users = mutableListOf<User1>()
    users.add(User1("admin", "admin@exvar.com", "12345"))
    users.add(User1("student", "student@example.com", "54321"))
    var counter = 0
    for ((username, email, password) in users) {
            counter++
        when (email) {
            "admin@exvar.com" -> println("Welcome Admin")
            "student@example.com" -> println("Welcome Guest")
        }
    }
    print(counter)
}