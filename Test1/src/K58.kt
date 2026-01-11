class NegativeNumberException:Exception("Parameter is less than zero")
class NonNegativeNumberException: Exception("Parameter is non-negative")
fun check(num1:Int){
    if(num1<0)throw NegativeNumberException()
    else if(num1>=0)throw NonNegativeNumberException()
}
fun main(){
    check(-5)
}