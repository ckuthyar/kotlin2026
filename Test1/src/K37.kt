//NOT CLEAR NEED TO REFACTOR
fun testString(){
    var str1:String?=null
    str1=""
    try{
        println(str1.length)
        str1=null
        if(2>1)throw Exception()
        str1=""
    }catch (exception1:Exception){
        println(str1?.length)
        print(exception1)
    }
}
fun main(){
    testString()
}