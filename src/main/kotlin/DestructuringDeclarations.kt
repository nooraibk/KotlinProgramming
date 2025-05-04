/**
 *Destructuring Declarations allows multiple values from objects, particularly useful when working with data classes, pairs, and maps. This feature allows developers to create multiple variables simultaneously from a single object, enhancing code readability and efficiency.
 */

fun main() {

    // For Data Classes
    val (name, id) = ForDestructuringDeclarations("John", 443)
    println("Name: $name, Id: $id")
    println("**************")


    // For Simple Classes
    val objSimpleClass = SimpleClass("Jeremy", 442)
    val (name1, id1) = objSimpleClass
    val age1 = objSimpleClass.component3()
    println("Name1: $name1, Id1: $id1, Age1: $age1")
    println("**************")


    // For Pairs
    val (shape, sides) = Pair("Box", 4)
    println("Shape: $shape, Sides: $sides")
    println("**************")


    // For Triples
    val myTriple = Triple("Ninja", true, "Kawasaki")
    val (bike, isSports) = myTriple
    val brand = myTriple.component3()
    println("Bike Name: $bike, Is Sport Type: $isSports, Brand Name: $brand")
    //or
    val (bike1, isSports1, brand1) = Triple("Chopper", false, "Harley Davidson")
    println("Bike Name: $bike1, Is Sport Type: $isSports1, Brand Name: $brand1")
    println("**************")


    // For Maps
    val myMap = mutableMapOf("Jessie" to "Breaking Bad", "Tommy Shelby" to "Peaky Blinders", "Sherlock" to "Sherlock Holmes")
    for ((i, j) in myMap){
        println("Character Name: $i, Show Name: $j")
    }
    println("**************")


    // For lambda expression
    val myMap1 = mutableMapOf("911" to "Porsche", "Enzo" to "Ferrari", "Aventador" to "Lamborghini")
    myMap1.forEach { (t, u) ->
        println("Car: $t, Brand: $u")
    }
    println("**************")


    // For returning function
    val (name2, age2) = returnsDataClass()
    println("Name2: $name2, Age2: $age2")
}

/**
 * For destructuring to work, the object must provide component functions (e.g., component1(), component2()). Kotlin's data classes (and similar types that support Destructuring Declarations like maps, pairs, triples etc.) automatically generate these functions for their properties.
 */

data class ForDestructuringDeclarations(
    val name : String,
    val id : Int
)

typealias SimpleClass = SimpleClassForDestructuringDeclarations


class SimpleClassForDestructuringDeclarations(
    val name : String,
    val id : Int
){
    val age : Int = 33

    operator fun component1() = name
    operator fun component2() = id
    operator fun component3() = age
}

fun returnsDataClass() = ForDestructuringDeclarations("Jessica", 40)