interface Animal{
    fun makeSound()
}
class Dog:Animal{
    override fun makeSound(){
        println("Dog says Woof Woof")
    }
}
fun printAnimalInfo(animal:Animal){
    animal.makeSound()
}
fun main(){
    val dog1=Dog()
    printAnimalInfo(dog1)
}