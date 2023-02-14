class myclass<out T> {
    val name: T? = null
    val age: T? = null

    fun print() {
        println(name)
        println(age)
    }
}

class ParameterizedClass<T>(private val value: T)
{
    fun getValue(): T {
        return value
    }
}

fun main() {
//    val i = myclass<Int>()
//    i.name = 12
//    i.age = 20
//    i.print()

//    val s = myclass<String>()
//    s.name="youssef"
//    s.age= "20"
//    s.print()
}