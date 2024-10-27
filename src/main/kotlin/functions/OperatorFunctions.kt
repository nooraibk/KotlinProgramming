package functions

import kotlin.math.roundToInt

fun main() {
    val obj = Math()

    //println(obj.plus(5))
    println(obj + 5)

    println(AnotherMath(10) - 4)
    println(+AnotherMath(10))

    println(BBImpl() + 3)
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

class AnotherMath(var varOne: Int) {
    operator fun minus(a: Int): Int {
        return varOne - a
    }

    operator fun minus(other: AnotherMath) : AnotherMath {
        return AnotherMath(varOne = -other.varOne)
    }

    operator fun unaryPlus() : Int = ++varOne

    operator fun plus(a : Double) : Int {
        return a.roundToInt()
    }
}

//we can also do operator overloading with interfaces

interface BB{
    operator fun plus(a : Int) : Int{
        return 10 + a
    }
}

class BBImpl : BB