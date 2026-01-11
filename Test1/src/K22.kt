fun main(){
    val arr1=arrayOf(1,2,3)
    for (i in 0..2){
        println(arr1[i])
    }
    println(arr1.joinToString())
    println(arr1.joinToString(" "))
    println(arr1.joinToString("\t"))
    println(arr1.joinToString("$"))

}