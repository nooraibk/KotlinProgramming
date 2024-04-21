package functions

fun main(){

    val obj = FirstClass()
    println(obj::testFun)
    obj.testFunTwo()
}


/**
 * double colon :: operator is used to call function from a class
 * you can also call function inside a class using "this" keyword with ::
 */

class FirstClass(){
    fun testFun() = "Hello Function One"
    fun testFunTwo(){
        println(this::testFunThree)
    }

    fun testFunThree(){
        println("Hello Function Three")
    }
}

