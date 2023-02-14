fun main() {
    var accountId: String = "abc123"
    var accountIdNull: String? = null
    println(accountId.length)//output:6
    println(accountIdNull!!.length)//output:exception
    //you say trust me ,it's nt null but actually you say lies

    println(accountIdNull?.length)
    //if you see it null, don't do it



//    var theChance=false
//    var yourMind:String?=null
//    if (theChance == true) yourMind=❤️kotlin

}