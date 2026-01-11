//open indicates that this class can be extended to create a sub class
open class WithdrawalException(message:String):Exception(message)
class InsufficientFundsException(message:String):WithdrawalException(message)

fun processWithdrawal(amount:Double,availableFunds:Double){
    if (amount >availableFunds){
        throw InsufficientFundsException("Insufficient funds")
    }
    if(amount <1 ||amount%1!==0.0){  //this logic not fully understood
        throw WithdrawalException("Invalid withdrawal amount")
    }
    println("Withdrawal processed")
}
fun main(){
    val availableFunds = 500.0
    val withdrawalAmount=500.5
    try{
        processWithdrawal(withdrawalAmount.toDouble(),availableFunds)
    }
    catch(e:InsufficientFundsException){
        println("Caught an InsufficentFundsException:$(e.message")
    }catch(e:WithdrawalException){
        println("Caught an WithdrawalException:$(e.message)")
    }
}