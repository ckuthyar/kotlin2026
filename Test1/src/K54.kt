import kotlin.random.Random
fun main(){
    do{
        var roll1=Random.nextInt(1,7)
        println("Value is $roll1")
    } while(roll1 !=6)
    println("Got a 6! Game over")

}