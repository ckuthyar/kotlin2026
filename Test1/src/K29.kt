fun main(){
    val arr1=arrayOf(2,4,6,8,8)
    val set1=arr1.toSet()
    println(arr1.contentDeepToString())
    println(set1)
    println(set1.size)
    println(set1.average())
    println(set1.sum())
    println(set1.min())
    println(set1.max())
    println(set1.contains(8))
}