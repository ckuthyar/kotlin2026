import kotlin.math.PI
fun main(){
    fun getArea1(radius:Double):Double{
        return PI*radius*radius
    }
    fun getArea2(radius:Double):Double=PI*radius*radius
    println(getArea1(20.0))
    println(getArea2(radius=20.0))

}