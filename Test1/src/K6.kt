import kotlin.random.Random
fun main(){
    val r1=Random.nextInt(6)
    val r2=Random.nextInt(6)
    println("$r1 $r2")
    if (r1==r2) println("you win") else println("try again")
}