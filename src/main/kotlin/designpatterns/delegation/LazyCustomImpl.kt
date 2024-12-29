package designpatterns.delegation

import kotlin.reflect.KProperty

fun main() {
    val abc : String by MyLazy{
        println("My Lazy triggered for the first time")
        "ABC"
    }

    println("value of abc $abc")
}

class MyLazy<out T : Any>(
    private val initialization : () -> T
){
    private var value : T? = null
    operator fun getValue(thisRef : Any?, property : KProperty<*>) : T {
        return if (value == null ){
            value = initialization()
            value!!
        } else value!!
    }
}