fun main(){
    val enteredPin=5678
    val storedPin=5555
    when(enteredPin) {
        storedPin.toInt()-> print("PIN is correct. You are successfully authenticated")
        else->print("Incorrect PIN. Try again")
    }

}