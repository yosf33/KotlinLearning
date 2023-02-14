fun main() {
    var number=6
    var factorial=1
    do {
        factorial *= number
        number--
    } while (number > 0)
//    println("factorial is $factorial")
    var i=1
    var num = 2
    do {
        println("2 * $i = "+num*i)
        i++
    }while (i<11)
}
