package functions

fun main() {
    val obj = Math()

    //println(obj.plus(5))
    println(obj + 5)

    println(AnotherMath(10) - 4)
    println(+AnotherMath(10))
}

/**
 * operator keyword allow operator overloading in kotlin. you can use appropriate name of the function with the relevant mathematical operator to call it without calling a function by its name. for example, you can define the functions.plus function and call it using + symbol. similarly, you can define the minus function and call it using - symbol. for available symbol and the function name against them, search documentation
 *
 * You can only use operator overloading with extension functions or member functions.
 */

operator fun Math.plus(a: Int): Int {
    val b = 34
    return (a + b)
}

class Math

class AnotherMath(private var varOne : Int) {
    infix operator fun minus(a: Int): Int {
        return varOne - a
    }

    operator fun unaryPlus() : Int = ++varOne

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override operator fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}