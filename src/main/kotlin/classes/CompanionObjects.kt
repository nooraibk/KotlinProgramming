package classes

/**
 * If you are familiar with Java, you may relate companion objects with static methods (even though how they work internally is totally different).
 * The companion objects can access private members of the class. Hence, they can be used to implement the factory method patterns.
 */

fun main(){

    println(staticDemo.num)

    println("Sum = ${XYZ.num1 + XYZ.num2}")
}



object staticDemo{
    val num = 2 //object members are like static members in Java
}



class XYZ{

    //companion object can only be created inside a class
//    companion object StaticCompanion{ //companion object members are actually static
//        val num1 = 2
//        val num2 = 4
//    }

    companion object{ //when using companion object, you can omit the name declaration
        val num1 = 2
        val num2 = 4
    }
}