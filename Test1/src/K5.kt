fun main(){
    val trafficLight="Red";
    val trafficAction = when(trafficLight){
        "Red" -> "STOP"
        "Green" -> "GO"
        else -> "UNKNOWN"
    }
    println("TrafficAction: $trafficAction because Traffic Light is $trafficLight")
}