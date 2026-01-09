fun main(){
    val mult2=listOf(2,4,6,8,10,12,14,16,18,20)
    val mult5=mult2.filter{x->x%5==0}    //paranthesis is removed
    println(mult5)
}