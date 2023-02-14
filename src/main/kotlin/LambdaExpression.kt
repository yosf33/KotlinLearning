fun findSquare(number: Int, operation: (Int) -> Int): Int {
    return operation(number)
}

val sum: (Int, Int) -> Int = { num1: Int, num2: Int -> num1 + num2 }
fun findSum(number1: Int, number2: Int) :Int{
    return sum(number1,number2)
}

fun mul(a: Int, b: Int): Int =a*b

fun higherOrderFunc():((Int,Int)->Int){

    return ::mul
}


fun main() {
//    val swim = { println("hellow world !")}
    //to use the function in function call
    val swim: () -> Unit = { println("I like swimming !") }
    swim()

    val squre = { num: Int -> num * num }

    squre(2)
    /**
     * let's pass lambda function via another function
     */
    println(findSquare(6, squre))
    println(findSum(6, 2))

    /**
     * today let's return a function from higher order function not lambda function
     */


}

