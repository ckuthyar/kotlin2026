
fun main(){
    val x="Hello"
    if(x !is String || x.length==0)return
    if(x is String || x.length>0){
        print(x.length)
    }
}