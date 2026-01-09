fun main(){
    fun toUpper1(word:String):String{
        return word.uppercase()
    }
    println(toUpper1("good morning"))
    println(toUpper1("Hello World"))

    //using Lambda function
    val upperString={word:String -> word.uppercase()}
    println(upperString("good evening using Lamda"))

}