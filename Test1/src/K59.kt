//DID NOT UNDERSTAND FULLY
class Person(val name:String?)
fun fail(message:String):Nothing{
    throw IllegalArgumentException(message)
}
fun main(){
    val p1=Person(name=null)
    val s:String=p1.name?:fail("Name required")
    println(s)
}