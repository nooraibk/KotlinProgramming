/**
 * In Kotlin, a type alias is a way to give an existing type a new name. This feature helps make your code more readable and maintainable by providing an alternative name for a type, which can be used throughout your codebase.
 */


fun main() {
    val str : Str = "Custom String Variable"
    println(str)

    val sum : MyLambda = { x, y -> x+y }
    println("Sum of 2 and 2 will be ${sum(2, 2)}")

    var myInterface : MyInterface? = null
    var myEnum : MyEnum = MyEnum.CASE1
    val innerString : MyInnerClass = MyOuterClass().MyInnerClass()
    println("inner String = ${innerString.str}")
}

typealias Str = String //cannot declare type aliases for local and nested types properties

/**
 * Type aliases can be used with:
 *
 * Classes: As shown in the example above, you can define a type alias for a class.
 *
 * Interfaces: You can define a type alias for an interface.
 *
 * Enums: Type aliases can be used with enums as well.
 *
 * Function types: You can define a type alias for a function type, including nullable and generic types.
 */

typealias MyLambda = (Int, Int) -> Int

interface AVeryLongInterfaceName
enum class AVeryLongEnumName{
    CASE1, CASE2
}

class AVeryLongClassName{
    inner class AVeryLongInnerClassName{
        val str = "InnerClassString"
    }
}

typealias MyInterface = AVeryLongInterfaceName
typealias MyEnum = AVeryLongEnumName
typealias MyInnerClass = AVeryLongClassName.AVeryLongInnerClassName
typealias MyOuterClass = AVeryLongClassName