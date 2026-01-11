fun processInput34(data1:Any){
    when(data1){
        is Int->println("${data1+1}")
        is String->println("message is $data1")
        is IntArray->println("${data1.sum()}")
    }
}
fun main(){
    processInput34(1001)
    processInput34("System rebooted")
    processInput34(intArrayOf(10,20,30))

}