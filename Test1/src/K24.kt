fun main(){
    val arr1=Array(2){Array<Int>(2){0} }
    println(arr1.contentDeepToString())
    var arr2=Array(size=3){Array(size=3){Array<Int>(size=3){0} } }
    println(arr2.contentDeepToString())

    arr1[0][0]=99
    println(arr1.contentDeepToString())

    arr2[0][0][0]=99
    println(arr2.contentDeepToString())
}


