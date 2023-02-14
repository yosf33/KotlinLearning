/*
we use JVM to create bytecode ?

Yes, the Java Virtual Machine (JVM) executes Java bytecode, which is compiled from Java source code.
 The JVM provides a platform-independent environment for running Java applications,
 regardless of the underlying hardware and operating system.
 */



fun main() {


    var x: Double = 5.5
    var y: Double = 3.0
    val pi: Double = 3.14
    var res: Double = x * y * pi
    val number2digits: Double = String.format("%.2f", res).toDouble()
    println("Result is :$number2digits")
}