//animal is declared as type Animal41, but it holds a Dog41 instance
//code casts animal to Dog41 type
//code uses a safe call(?.) to access the bark() function.
//this is an example of downcasting
interface Animal41{
    fun makeSound()
}
class Dog41:Animal41{
    override fun makeSound(){
        println("Dog says Woof Woof")
    }
    fun bark(){
        println("BARK!")
    }
}
fun main(){
    val animal:Animal41=Dog41()
    val dog1:Dog41?=animal as? Dog41
    dog1?.bark()
}