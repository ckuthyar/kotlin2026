fun main(){
    fun getEven(): MutableList<Int>{
        val even=mutableListOf(0)
        for (i in 2..100 step 2){
            even.add(element=i)
        }
        return even
    }
    fun getOdd():MutableList<Int>{
        val odd=mutableListOf(1)
        for(i in 3..100 step 2){
            odd.add(element=i)
        }
        return odd
    }
    println(getEven())
    println(getOdd())
}