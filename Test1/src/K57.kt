fun divideOrNull(a:Int):Int{
    try{
        val b=44/a
        println("try block: Executing division: $b")
        return b
    }catch(e:ArithmeticException){
        println("catch block: Encountered ArithmeticException $e")
        return -1
    }finally{
        println("finally block: The finally block is always executed")
    }
}
fun main(){
    divideOrNull(0)
}