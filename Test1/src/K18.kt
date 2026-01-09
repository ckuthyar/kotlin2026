fun main(){
    val mult2=listOf(2,4,6,8,10,12,14,16,18,20)
    val mult4=mult2.filter({x ->x%4==0})
    val mult5=mult2.filter({x ->x%5==0})
    val negative=mult2.filter({x->x<0})

    println(mult4)
    println(mult5)
    println(negative)
}

