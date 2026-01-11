fun hasPrefix(input1:Any):Boolean=when(input1){
    is String->input1.startsWith("ID-")
    else->false

}
fun main(){
    print(hasPrefix("ID-1234"))
}