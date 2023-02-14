data class MotorVehicle(
    val name: String,
    val model: Int,
    val manufacturer: String
)

fun main() {
    /**
     * if there is not flatmap
     */
    var cars = listOf(
        MotorVehicle("Swift", 2019, "Maruti"),
        MotorVehicle("Altroz", 2020, "Tata"),
        MotorVehicle("Verna", 2016, "Hyundai")
    )

    var bikes = listOf(
        MotorVehicle("R-15", 2018, "Yamaha"),
        MotorVehicle("Gixxer", 2017, "Suzuki")
    )

    var allVehicle = mutableListOf<MotorVehicle>()
    allVehicle.addAll(cars)
    allVehicle.addAll(bikes)
    println(allVehicle)

    /**
     * when we use flatmap
     */

    val vehicles = listOf(cars, bikes)//this a list of many lists ,but let's make it one list
    println(vehicles)
    val allVehicle2 = vehicles.flatMap {
        it
    }


    val manufacturerList = vehicles.flatMap { it }.map{it.manufacturer}
    println(manufacturerList)


}