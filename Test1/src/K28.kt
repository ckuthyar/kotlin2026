fun main(){
    val arr1=arrayOf(2,4,6,8)
    println(arr1.contentDeepToString())
    println(arr1.joinToString())

    arr1.shuffle()
    println(arr1.contentDeepToString())
    println(arr1.joinToString())
}