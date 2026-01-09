fun main(){
    val even=listOf(2,4,6,8,10)
    val squares=even.map({x->x*x})
    val cubes=even.map({x->x*x*x})
    println(squares)
    println(cubes)
}