fun logMessage33(data1: Any) {
    if (data1 !is String) return
    println("${data1.length} characters received")
}

fun main(){
    logMessage33("User logged in")
    logMessage33(true)
}


