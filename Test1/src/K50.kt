fun main(){
    val x=40
    when (x){
        in 1..10->print("x is in the range")
        in 10..20->print("x is still in the range")
        else -> print("$x is outside the range")
    }
}