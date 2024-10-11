package oop

open class Animal {
    open fun makeSound() {
        println("Some generic animal sound")
    }
}

class Dog : Animal() {

    override fun makeSound() {
        println("Woof! Woof!")
    }
}

fun handleAnimal(animal: Animal) {
    if (animal is Dog) {
        // Smart cast: 'animal' is automatically cast to Dog within this block
        animal.makeSound() // This is valid because 'animal' is now treated as a Dog
    }
}

////////////////////////////

fun describe(obj: Any) {
    when (obj) {
        is Int -> {
            // Smart cast: obj is automatically cast to Int within this block
            println("It's an integer: $obj")
            println("Its square is: ${obj * obj}")
            if (obj % 2 == 0) {
                println("It's an even number")
            } else {
                println("It's an odd number")
            }
        }
        is String -> println("It's a string of length ${obj.length}")
        else -> println("It's something else")
    }
}

fun main() {
    val myDog: Animal = Dog()
    handleAnimal(myDog)
}
