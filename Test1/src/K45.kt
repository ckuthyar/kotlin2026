fun main(){
    val deliveryStatus="OutForDelivery"
    when(deliveryStatus){
        "Pending"->print("Your order is being prepared")
        "Shipped"->print("Your order is on the way")
    }
}
//here both conditions are not met. Hence no print statement is executed
