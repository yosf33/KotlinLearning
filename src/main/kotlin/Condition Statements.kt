fun CharProgression.printAll() {
    this.forEach {
        print(" $it ")
    }
}

fun main() {
    val isUserBlocked = false
    val followersCount = 3200000000
//1-normal if
    if (isUserBlocked) {
        println("user blocked")
    } else {
        println("user not blocked")
    }

    if (followersCount < 1000) {
        println(followersCount)
    } else if (followersCount < 1000000) {
        println("${followersCount / 1000}k")
    } else {
        println("${followersCount / 1000000}M")
    }

    val firstNumber = 100
    val secondNumber = 120
    var max: Int
    if (firstNumber < secondNumber) {
        max = secondNumber
    } else {
        max = firstNumber
    }
    println("the max number is :$max")

    max = if (firstNumber < secondNumber) secondNumber else firstNumber
    println("the max number is :$max")

    var fierndCount = 3291
    if (fierndCount >= 0 && fierndCount <= 20) {
        println("lonely")
    } else if (fierndCount >= 20 && fierndCount <= 100) {
        println("family&friend")
    } else if (fierndCount >= 100 && fierndCount <= 500) {
        println("social person")
    } else if (fierndCount >= 500 && fierndCount <= 5000) {
        println("famous")
    }



//2-in range

    if (fierndCount in 0..20) {
        println("lonely")
    } else if (fierndCount in 20..100) {
        println("family&friend")
    } else if (fierndCount in 100..500) {
        println("social person")
    } else if (fierndCount in 500..5000) {
        println("famous")
    }
    val myRange=5.rangeTo(100)step (5)
//    myRange.printAll()
    val someNumber = 5//readLine()!!.toInt();
    if (someNumber in myRange) {
        println("$someNumber is in range")
    } else {
        println("$someNumber isn't in range")
    }

    val myCharRange = 'a'..'m'
    val someChar= 'y'//readLine()!!.toCharArray()[0]
    if (someChar in myCharRange) {
        println("in my range")

    } else {
        println("not in my range")
    }

    //3-when statement
    when (fierndCount) {
        in 0..20 -> {
            println("lonely")
        }
        in 20..100 -> {
            println("family&friend")
        }
        in 100..500 -> {
            println("social person")
        }
        in 500..5000 -> {
            println("famous")
        }
    }

    val myNumber=5
    when (myNumber) {
        1 -> println("one")
        2 -> println("two")
        3-> println("three")
        else-> println("other nubmer")
    }
    when (myNumber) {
        1,10 -> println("one")
        2,20 -> println("two")
        3,5-> println("three")
        else-> println("other nubmer")
    }
    when (myNumber) {
        in 1..9-> println("one")
        in 10..99-> println("two")
        in 100..999-> println("three")
        else-> println("long number")
    }


   val digitCounter:String?= when (myNumber) {
       !in 20..40->"some number"
        in 1..9-> "one"
        in 10..99-> "two"
        in 100..999-> "three"
        else-> null
    }
    println(digitCounter)
}
