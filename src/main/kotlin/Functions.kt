var likeCount = 0
fun main() {
    //region printing
    like(likeCount)
    like(likeCount)
    like(likeCount)
    like(likeCount)
    disLike()
    //endregion
    showLikes()
    getAgeStage(12)
}

fun like(oldLikesCount: Int): Int {
    return oldLikesCount + 1
}

fun disLike() {
    likeCount--
}

fun getLikeDetails(): String {
    return "likes :$likeCount"
}

fun checkLikeDetails(): String =
    "like :$likeCount"

//compact function
fun showLikes() = println(getLikeDetails())
fun isEven(number: Int) = number % 2 == 0

/**
 * this comment called documentation
 * this method to determine the stage of the age
 * @param age this is the age of user
 * @return a string represent the age of person
 * @see checkLikeDetails to find count of likes
 * @link www.google.com
 */

fun getAgeStage(age: Int) = when (age) {
    in -1 downTo Int.MIN_VALUE -> "no"
    in 0..4 -> "baby"
    in 5..12 -> "child"
    else ->"no"
}
//you have default value like constructor
fun sayHello(name:String="my friend"):String="Hello $name"
fun toPower(number: Int, power: Int) :Int {
    var result=number
    for (i in 1 until power) {
        result*=number
    }
    return result
}