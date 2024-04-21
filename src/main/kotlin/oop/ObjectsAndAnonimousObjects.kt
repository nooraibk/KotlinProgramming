package oop

fun main(){
    println(A.num)
    B.test()
}


//Objects are simple classes with single object declaration. It means these classes can only be called from there original name reference and can only have one single object, aka "signleton object." you can declare any member variable or function inside these object classes. You cannot use constructors in objects however you can use init block. object can also inherit other classes or interface. however they themselves cannot be inherited.

object A{
    val num = 10
}

interface inter{
    val A: Int
    val B: Int
}

object B: inter{

    val p = 20
    fun test(){
        println("Hello from Object B")
    }

    override val A: Int
        get() = TODO("Not yet implemented")
    override val B: Int
        get() = TODO("Not yet implemented")
}

