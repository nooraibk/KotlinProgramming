package functions

/**
 * a closure refers to a function that can access variables and parameters from its surrounding scope, even after the scope has finished execution. It captures the variables it needs, stores them, and can access them later when the function is invoked. The captured variables maintain their state, and any modifications made to them within the closure will be preserved.
 */

fun main() {
    val incrementByTwo = createIncrementFunction(2)
    println(incrementByTwo()) // Output: 2
    println(incrementByTwo()) // Output: 4
}

fun createIncrementFunction(incrementBy: Int): () -> Int {
    var count = 0

    return {
        count += incrementBy
        count
    }
}

/**
 * In this example, the function literal passed to the filter method uses the nameToMatch parameter defined in the outer scope. This parameter is captured by the closure and used to filter the students.
 */

class Student(val firstName: String, val lastName: String)

fun loadStudents(): List<Student> = listOf() // load from database

fun students(nameToMatch: String): List<Student> {
    return loadStudents().filter { it.lastName == nameToMatch }
}

