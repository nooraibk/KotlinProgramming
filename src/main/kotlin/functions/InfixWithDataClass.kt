package functions

fun main() {
    val person = Person("John", 25)

    person greet { message ->
        println(message)
    }

    person updateAgeBy 5

    println("Updated age: ${person.age}")
}

data class Person(val name: String, var age: Int) {
    infix fun greet(greeting: (String) -> Unit) {
        greeting("Hello, dsl.I'm $name!")
    }

    operator fun invoke(greeting: (String) -> Unit) {
        greeting("Invoking $name!")
    }

    infix fun updateAgeBy(ageIncrement: Int) {
        age += ageIncrement
    }
}
