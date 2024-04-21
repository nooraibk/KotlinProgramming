package oop

fun main(){


    val objNonAbstract = NonAbstractClass()
    objNonAbstract.firstNonAbstractClassFromAbstractClass()
    objNonAbstract.firstAbstractClassFunction()
}


abstract class FirstAbstractClass{
    abstract fun firstAbstractClassFunction()

    fun firstNonAbstractClassFromAbstractClass(){
        println("First NonAbstract Function from Abstract Class")
    }
}

class NonAbstractClass: FirstAbstractClass() {
    override fun firstAbstractClassFunction() {
        println("Overridden function")
    }
}