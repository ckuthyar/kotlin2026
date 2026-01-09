fun main(){
    val regNames=mutableListOf("Amar","Anand")
    fun registerUser(username:String):String{
        if (username in regNames){
            return "username already taken"
        }
        regNames.add(username)
        return "User $username registered successfully"
    }
    println(registerUser("Shekar"))
    println(registerUser("Chandra"))
    println(registerUser("Rao"))
    println(registerUser("Anand"))
}