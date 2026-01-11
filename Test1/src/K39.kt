fun main(){
    val input1:Any="user=1234"
    val userId=input1 as? String
    println("$userId has logged in")
    val wrong1=input1 as? Int
    println("$wrong1 is not a valid input")
}