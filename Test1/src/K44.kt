fun main(){
    val x=2
    //when is used as an expression. The return value can be used in the code later on
    val text1=when(x){
        1->"x==1"
        2->"x==2"
        else->"x is neither 1 nor 2"
    }
    println("$text1 - Output of Case 1")
    //when is used as a statement. When completes an action without returning a result
    when(x){
        1->print("x==1")
        2->print("x==2")
        else->print("x is neither 1 nor 2")
    }
}