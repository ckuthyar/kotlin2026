//Fizz Bizz game
fun main(){
    var nums=mutableListOf("1")
    for (i in 2..100) {
        if(i.mod(3)==0 && (i.mod(5)==0)){
            nums.add(element="fizzbizz")
        }
        else if (i.mod(3) == 0) {
            nums.add(element = "fizz")
        }
        else if (i.mod(5) == 0) {
            nums.add(element = "biz")
        } else {
            nums.add(element = i.toString())
        }

    }
    println(nums)
}