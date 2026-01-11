fun logMessage(data:Any){
    if (data is String){
        println("${data.length} characters long")
    }
}
fun main(){
    logMessage("Server started")
    logMessage(404)
}