package designpatterns.delegation

fun main() {
    val baseImpl = BaseImpl()
    DelegateBase(baseImpl).printMessage(message = "Implementation of Base")
}


interface Base{
    fun printMessage(message : String)
}

class BaseImpl : Base {
    override fun printMessage(message: String) {
        println("Printing Message from BaseImpl : $message")
    }
}

class DelegateBase(base : Base) : Base by base

// or
//class DelegateBase : Base by BaseImpl()
