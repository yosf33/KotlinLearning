fun main() {
    var firstString = "hello"
    var secondString = "world"
    println("$firstString$secondString")

    var userAge = "20"
    var userInfo = "user age :$userAge"
    var userInfo2 = "user age :($userAge)"
    var userInfo3 = "user age :(${userAge+1})"
    println(userInfo3)



}