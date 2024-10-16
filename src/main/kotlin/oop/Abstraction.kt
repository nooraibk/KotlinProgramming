package oop

fun main(){
    val obj = Laptop()
    obj.purpose()
    obj.domain()
    //*****leter will take to the overridden implementation, however if the there is no overriden
}

abstract class Electronics{ //when you make a class of function abstract then there is no need for open keyword
    abstract fun purpose()

    open fun domain(){
        println("Domain of Electronic Device")
    }

    fun notOverridable(){
        println("Compile time error on trying to override it")
    }
}

class Laptop : Electronics(){
    override fun purpose(){
        println("Computational Tasks")
    }

    override fun domain(){

    }

//    override fun notOverridable(){
//
//    }
}