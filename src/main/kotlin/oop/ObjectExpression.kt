package oop

fun main(){

    //object expression is a singleton object without any reference. You can directly initialize an object without any reference, similar to anonymous objects.
    val obj = object{
        val string = "object expression"
        fun mFunction():String{
            return "This is $string" //using println() will also print return type of function
        }
    }

    println(obj.mFunction())



    //object expression can also be used to implement interfaces anonymously

    val obj1 = object: cloneable{
        override fun clone() {
            println("this function is cloned")
        }
    }

    obj1.clone()
}


interface cloneable{
    fun clone()

}

