fun main(){
    var obj = Maths()

    //println(obj plus 4)
    println(obj + 5)
}

/**
 * The infix function does not require the conventional way of calling a method rather you can use simple english words to call an infix function. However, this function only works with one argument and should be defined as an extension function.
 */

/**
 * operator keyword allow operator overloading in kotlin. you can use appropriate name of the function with the relevant mathematical operator to call it without calling a function by its name. for example, you can define the plus function and call it using + symbol. similarly, you can define the minus function and call it using - symbol. for available symbol and the function name against them, head over to https://kotlinlang.org/docs/references/operator-overloading.html
 *
 * You can only use operator overloading with extension functions or member functions.
 */

infix operator fun Maths.plus(a : Int) :Int{
    var b = 34
    return(a+b)
}

class Maths{

}