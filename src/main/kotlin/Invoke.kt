/**
 * invoke lets an instance of a class have a default function
 * invoke is an operator function.
 * Can take parameters.
 * Can be overloaded.
 * This operator seems especially useful for classes that really only have one method to be used.
 */


fun main(){
    val config = Config()
//    config.get() //this is how normally we call a function in any class

    val greeter = Greeter("Hello")
    greeter("World")
    greeter()

    //behind the scene calling method without their name is internally translated by compiler as
    greeter.invoke("World")
    greeter.invoke()
    //invoke keyword is optional here, hence returning the same output

    val zObj = ZZZZ("abc value")
    zObj.invoke("invoke param value")
    println(zObj.abc)
}

//this is how normally we call a function in any class
class Config {
    fun get():String {
        return "stuff"
    }
}


//now by using invoke operator
class Greeter(val greeting: String) {
    //Specifying an invoke operator on a class allows it to be called on any instances of the class without a method name.

    operator fun invoke(){
        println("Invoke without any parameter")
    }

    operator fun invoke(name: String) {
        println("$greeting $name")
    }
}


class ZZZZ(var abc: String){
    operator fun invoke(invokeParam : String){
        abc = "Class Member \"abc\" value is $abc and \"invoke\" param value is $invokeParam"
    }
}
