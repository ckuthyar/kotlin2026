fun main(){
    val ticketPriority="Critical"
    when (ticketPriority) {
        "Low","Medium"->print("response in 72 hours")
        else->print("response in 24 hours")
    }
}