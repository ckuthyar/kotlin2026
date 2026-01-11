import kotlin.random.Random
enum class Bit{
    ZERO, ONE
}
fun getRandomBit():Bit{
    return if(Random.nextBoolean())Bit.ONE else Bit.ZERO
}
fun main(){
    val value1=when(getRandomBit()){
        Bit.ZERO -> 0
        Bit.ONE -> 1
    }
    println("$value1 is the value")
}