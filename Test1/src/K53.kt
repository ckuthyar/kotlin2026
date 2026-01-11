fun main(){
    var carsInGarage=198
    val carsMaxCapacity=200
    while(carsInGarage<carsMaxCapacity){
        println("Car entered. Total cars in Garage is ${++carsInGarage}")
    }
    println("Garage is full")
}