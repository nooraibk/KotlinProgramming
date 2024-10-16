package functions

fun main(){
    val obj = Math()

    //println(obj.plus(5))
    println(obj + 5)
}

/**
 * operator keyword allow operator overloading in kotlin. you can use appropriate name of the function with the relevant mathematical operator to call it without calling a function by its name. for example, you can define the functions.telusko.plus function and call it using + symbol. similarly, you can define the minus function and call it using - symbol. for available symbol and the function name against them, head over to https://kotlinlang.org/docs/references/operator-overloading.html
 *
 * You can only use operator overloading with extension functions or member functions.
 */

operator fun Math.plus(a : Int) :Int{
    val b = 34
    return(a+b)
}

class Math