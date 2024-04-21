package oop


fun main(){
    val obj1 = DataClasses("Ali", 21)
    val obj2 = DataClasses("Usman", 19)

    val obj3 = obj2.copy()
    val obj4 = obj1.copy(age= 33)

    println(obj2.equals(obj3)) //check warning to see alternate solution
    println("*******************")

    println(obj4)
    println("*******************")


    println(obj1.component1() + " " + obj1.component2())
    println("*******************")


    println(obj3.toString()) //check scoped function's overridden toString() function
}


data class DataClasses(
    val name: String,
    val age: Int
)

/**The compiler automatically derives the following members from all properties declared in the primary constructor:
 * (these are also the functions that are usually required by every model class)
 *
 * equals()/hashCode() pair
 * toString() of the form "User(name=John, age=42)"
 * componentN() functions corresponding to the properties in their order of declaration.
 *copy() function.
 */