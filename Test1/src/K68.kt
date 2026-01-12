import kotlin.math.pow
fun powerOf(num1:Double,exp1:Double):Double{
    //num1=2 val cannot be reassigned
    return(num1.pow(exp1))
}
fun main(){
    print(powerOf(4.0,2.0))
}