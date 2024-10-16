package testing

interface Testing {
    fun abc() {
        println("abc from interface one")
    }
}

interface TestingONe {
    fun abc() {
        println("abc from interface two")
    }
}

class ZZZ

class Extensionss : Testing, TestingONe {
    private val list: List<String> = listOf("")
    private val array: Array<String> = arrayOf("")

    val oneClass = ABC(0)
    val twoClass = oneClass
    override fun abc() {
        val x = ABC(0, 1) + ABC(2, 3)
        val (l, y) = oneClass
        println("tag-->$x")
        super<Testing>.abc()
        super<TestingONe>.abc()
        println("abc from class ")
    }
}

class Person {



    var name: String = "John"
        get() {
            println("Getting name")
            return field
        }
        set(value) {
            println("Setting name to $value")
            field = value
        }
}


data class ABC(
    val a: Int = 0,
    val b: Int = 0
) {
    operator fun plus(other: ABC): ABC {
        return ABC(this.a + other.a, this.b + other.b)
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}

class ABX(
    val a: Int = 0
) {
}
//}
//class Utils {
object MYCLADD {
    var abc : Int? = null

    @JvmStatic
    fun doSomething() {
        abc = 9
        println("Doing something")
    }
}




inline fun <reified T> getTypeName(): String {
    return T::class.simpleName ?: "Unknown"
}

inline fun higherOrderFunction(crossinline lambda: () -> Unit) {
    val runnable = Runnable {
        lambda()
    }
    runnable.run()
}

fun main() {

    higherOrderFunction {
        return@higherOrderFunction
    }

    val vadd = arrayOf("323", 4323)

    var dd : Int = 9

    if (MYCLADD.abc != null){
        println("abccc")
    }

//    val a = "Hello"
//    val b = "Hello"
//    val c = a
//
//    println(a == b) // Output: true (structural equality)
//    println(a === b) // Output: true (referential equality)
//    println(a === c) // Output: true (referential equality)


//    var obj11 = Extensionss()
//    obj11.abc()
}