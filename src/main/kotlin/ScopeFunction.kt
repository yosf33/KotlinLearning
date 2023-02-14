class Company() {
    lateinit var name: String
    lateinit var objective: String
    lateinit var founder: String
    override fun toString(): String {
        return "Company(name='$name', objective='$objective', founder='$founder')"
    }

}

fun main() {
//    (1)let
    var a: Int? = null
    a?.let { print(it) }

    a = 2
    a?.let {
//        print(it)
    }

//    (2)apply
    val gfg = Company().apply {
        founder = "Sandeep Jain"
        name = "GeeksforGeeks"
        objective = "A computer science portal for Geeks"
    }

//    (3)with to use the member of the class without calling lambda result (this.)
    with(gfg) {
//        println(name)
    }

//    (4)run :mix with and let save from null exception and access member
    var company: Company? = null
    println("company name :")
    company?.run {
        print(name)
    }
    //rusty code company still null so it doesn't work apply block
//    company?.apply {
//        name = "geeks for geeks"
//        founder="sandeep"
//    }
//    company?.run {
//        print(name)
//    }


//    re-intelligizing
    company = Company().apply {
        name = "geeks for geeks"
        founder = "sandeep"
    }
    company?.run {
        print(name)
    }

//    (5)also:
    // initialized
    val list = mutableListOf<Int>(1, 2, 3)

    // later if we want to perform
    // multiple operations on this list
    list.also {
        it.add(4)
        it.remove(2)
        // more operations if needed
    }
//    println(list)

//    notes :
//    (1)we can use with to get the member of the class like destructing declarations:
    val founderName: String = with(Company()) {
        // 'founder' is returned by 'with' function
        founder
    }
//    println("GfG's Founder : $founderName")


    /**
    Scope functions make code more readable, clear and concise.
    Object reference – ‘this’ and ‘it’.
    Return value – context object and lambda result.
    let : working with nullable objects to avoid NullPointerException.
    apply : changing object configuration.
    run: operate on nullable object, executing lambda expressions.
    also : adding additional operations.
    with : operating on non-null objects.
     */

}
