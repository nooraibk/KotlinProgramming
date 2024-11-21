package designpatterns.delegation

import kotlin.reflect.KProperty

fun main() {
    //pending
    val testVar by test()
    println(testVar)
}

//pending
class Test {
    operator fun getValue(a: Int?, b: KProperty<*>): Int? {
        return 3
    }
}
fun test() = Test()