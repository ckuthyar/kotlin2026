fun count():Int{
    val a=0
    return 10/a
}
fun main(){
    val num1:Int=try{
        count()
    }catch (e: ArithmeticException){
        -1
    }
    println("Result: $num1")
}