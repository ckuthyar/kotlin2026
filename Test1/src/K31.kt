fun main(){
    val input1: Any=4
    val input2: Any="Hello"
    if(input1 is String){
        println("$input1 is a String")
    }
    if(input1 !is String){
        println("$input1 is not a String")
    }

    if(input2 is String){
        println("$input2 is a String")
    }
    if(input2 !is String){
        println("$input2 is not a String")
    }
}