fun main() {
    val firstResult = doOperation(8, 4) { num1, num2 -> num1 * num2 }
    val secondResult=doOperation(num2 = 4,
                                num1=8,
                                myFunction = ::sum
                                    )
    val thirdResult=doOperation(4,8,sum)

    println(firstResult)
    println(secondResult)
    println(thirdResult)
}

fun sum(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun doOperation(num1: Int, num2: Int, myFunction: (Int, Int) -> Int): Int {
    return myFunction(num1, num2)
}

val multiplication = { num1: Int, num2: Int ->
    num1 * num2
}