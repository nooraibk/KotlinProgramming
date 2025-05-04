package functions

fun main(){
    var obj = Maths()

    //println(obj functions.telusko.plus 4)
    println(obj add 5)
}

/**
 * The infix function does not require the conventional way of calling a method rather you can use simple english words to call an infix function. However, this function only works with one argument and should be defined as an extension function.
 */

infix fun Maths.add(a : Int) :Int{
    var b = 34
    return(a+b)
}

class Maths