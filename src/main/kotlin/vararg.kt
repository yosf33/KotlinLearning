fun main() {
    val result1=getAverage(1,2,3,4,5,6,7,8,9,10)
   println( result1  )
}
fun getAverage(vararg input: Int): Float {
    var sum=0.0f
    for (i in input) {
        sum+=i
    }
    return (sum/input.size)
}