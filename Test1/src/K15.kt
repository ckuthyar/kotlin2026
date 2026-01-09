fun main(){
    fun getArea(radius:Int):Double{
        val pi=3.14
        val area=pi*radius*radius
        return area
    }
    println(getArea(5))
    println(getArea(radius=10))
}