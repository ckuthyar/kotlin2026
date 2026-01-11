//function to print all items in a string
fun printAll(vararg strings:String){
    for(i in strings){
        println(i)
    }
}
//using spread operator * to identify and pass individual items
fun main(){
    val arr1=arrayOf("c","d")
    printAll("a","b",*arr1)
}
