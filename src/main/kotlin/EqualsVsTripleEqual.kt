// == vs === or Structural Equality vs Referential Equality

/**
 * == (Structural Equality Operator)
 *use == when you want to compare the values or contents of two objects, and use === when you want to check whether two objects refer to the same memory location.
 */


fun main() {

    val person1 = Person("John", 25)
    val person2 = Person("John", 25)
    val person3 = Person("John", 26)
    val person4 = person1.copy()
    val person5 = person1

    println(person1 == person2) // true
    println(person1 == person3) // false

    /**
     * === (Reference Equality Operator)
     * === checks for reference equality, which means it compares the memory addresses or references of two objects. It checks whether both objects point to the same location in memory. This operator is similar to the == operator in Java, but only for primitive types like Int, String, etc.
     */

    println(person1 === person3) // false
    println(person1 === person4) // false, different memory references for both objects
    println(person1 === person5) // true, same memory references for both objects

    val str1 = "Hello"
    val str2 = "Hello"

    println(str1 === str2) // true (different object reference)

    /**
     *  here true can be explained by the concept of Primitive Caching.

    In Kotlin (and Java), primitive types are stored in memory. When you create a primitive variable, Kotlin checks if an identical variable already exists in the memory. If it does, it reuses that reference instead of creating a new one. //search more

    Referential Equality: The === operator checks if both references point to the same object in memory. Since both str1 and str2 are initialized with the same string literal "Hello", they refer to the same instance in the memory. Therefore, str1 === str2 evaluates to true.
     */

    val str3 = str1
    println(str1 === str3) // true (same object reference)

    val int1 = 22299.0777
    val int2 = 22299.0777

    println(int1 === int2)

}

/**
 * == checks for structural equality, which means it compares the values or contents of two objects. It checks whether the objects have the same properties, fields, or attributes, and their corresponding values are equal. This operator is similar to the equals() method in Java.
 */

data class Person(val name: String, val age: Int)
