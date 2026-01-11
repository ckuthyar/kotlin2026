fun main(){
    val arr1=arrayOf(2 to "two", 4 to "four", 6 to "six", 8 to "eight")
    println(arr1.contentDeepToString())

    val map1=arr1.toMap()
    println(map1)
    println(map1.keys)
    println(map1.values)
    println(map1[8])
    println(map1.size)
    println(map1.toString())
    println(map1.getValue(8))
    println(map1.entries)
    println(map1.contains(8))
    println(map1.containsKey(8))
    println(map1.isEmpty())
}