import kotlin.random.Random

abstract class Animal(val name:String){
    val age : Int = Random.nextInt(1,11)
    abstract fun talk()
}

class Dog(name: String) : Animal(name){
    override fun talk() {
        println("$name: Woof!")
    }
}

class Cat(name: String): Animal(name){
    override fun talk() {
        println("$name: Meow!")
    }
}

fun main(){

    val dogs = listOf<Dog>(
        Dog("Coco"),
        Dog("Bella"),
        Dog("Chip"),
        Dog("Toby"),
        Dog("Mimi")
    )

    val cats = listOf<Cat>(
        Cat("Cinnamon"),
        Cat("Ash"),
        Cat("Luna"),
        Cat("Daisy"),
        Cat("Sam")
    )

    for(cat in cats){
        cat.talk()
        for(dog in dogs){
            if( dog.age > cat.age ) dog.talk()
            }
        }
    }
