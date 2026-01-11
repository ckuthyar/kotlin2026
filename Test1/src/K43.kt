fun main(){
    val userRole="Editor"
    when (userRole) {
        "Viewer"->println("User has read-only access")
        "Editor"->println("User can edit content")
        else->print("user role is not recognized")
    }
}