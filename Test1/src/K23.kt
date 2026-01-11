fun main(){
    val arr1:Array<Int?> =arrayOfNulls(3)
    for (i in 0..2){
        println(arr1[i])
    }
    val arr2=emptyArray<String>()
    val arr3:Array<String> =emptyArray()
    val arr4=Array<Int>(3){0}
    var arr5=Array(5){i->(i*i).toString()}
    arr5.forEach { print(it) }

}


