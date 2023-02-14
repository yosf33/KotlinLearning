fun main() {
    var username = "ahmed Diaa"//base:0
    var secondWord=username.indexOf('D')
    println(secondWord)


    val str = "Hello World"
    var strSecondWord=str.indexOf('l')
    val sub = str.substring(strSecondWord)
    println(sub)

    println(username.substring(3))//output:ed...
    println(username.indexOf('y'))//output:-1
    println(username.capitalize())//output:A..
    var blankvariable = "    "
    println(blankvariable.isBlank())
}