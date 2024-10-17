/**
### Limitations

Smart casting works under certain conditions:

- The type check must be done in a straightforward way (using is).
- The variable must not be modified after the type check (e.g., reassigned or changed).
- It works with immutable variables (declared with val). If a variable is mutable (declared with var), the compiler cannot guarantee that its type hasn't changed after the check.
*/



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

class Cat : Animal() {
    override fun makeSound() {
        println("Meow! Meow!")
    }
}

fun handleAnimal(temp : Int) {
    var animal = Animal()

    if (temp == 0){
        animal = Dog()
    }

    if (temp > 0){
        animal = Cat()
    }

    if (animal is Cat) {
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

// later
//https://www.perplexity.ai/search/there-are-two-implementations-oVz2gnYyROiDeEL_eUvJeA


fun main() {
    handleAnimal(1)

    var x: String? = "Hello"
    if (x != null) {
        println(x.length) // This works
        println(x.uppercase()) // This also works
        x = null
        println(x?.length) // Error: x is nullable and is not checked for null
    }

}
