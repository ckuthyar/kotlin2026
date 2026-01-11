//DID NOT UNDERSTAND PROPERLY
interface Status{
    fun signal(){}
}
interface Ok: Status
interface Postponed: Status
interface Declined: Status

fun signalCheck(signalStatus: Any){
    if (signalStatus is Postponed || signalStatus is Declined){
        signalStatus.signal()
    }
}

fun main(){
    signalCheck("Postponed")
}