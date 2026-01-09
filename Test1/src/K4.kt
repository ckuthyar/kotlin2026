fun main(){
    val even=listOf(2,4,6,8)
    val odd=listOf(1,3,5,7)
    val count1=even.count()
    val count2=odd.count()
    println(count1+count2)

    val supported=setOf("HTTP","HTTPS","FTP")
    val requested="smtp"
    val isSupported=supported.contains(requested)
    println("$requested is supported: $isSupported")

    val digits=mapOf(1 to "One", 2 to "Two",3 to "Three")
    val num1=2
    val words1=digits[num1]
    println("$num1 is $words1")

    val age=20
    var canVote=false
    if (age>18){
        canVote=true
        println("can vote")
    }
    else{
        canVote=false
        println("cannot vote")
    }

    if(age>18) canVote=true else canVote=false
    if(canVote) println("can Vote") else println("cannot Vote")

    val num2=5
    when (num2){
        4 ->println("four")
        5 ->println("five")
        6 ->println("six")
        else ->println("unknown")
    }

    var isFive=false
    isFive=when(num2){
        5 ->true
        else ->false
    }
    println(isFive)

}