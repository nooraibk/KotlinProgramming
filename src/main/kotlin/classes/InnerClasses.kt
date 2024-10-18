package classes

fun main() {
    val demo = MyOuterClass().Inner().foo() // == 1
//    val demo = MyOuterClass.Inner().foo() // == 1
    //not providing constructor declaration gives error:: Constructor of inner class Inner can be called only with receiver of containing class
    val outerObj = MyOuterClass()
//    outerObj.innerVariable //outer class cannot access inner class members directly

}

/**
 *A nested class marked as inner can access the members of its outer class. Inner classes carry a reference to an object of an outer class:
 */

class MyOuterClass {
    private val bar: Int = 1
    private fun abc(){}
    inner class Inner {
        val innerVariable = 1
        fun foo() = bar
        fun callingabc() = abc()
        //inner class can call outer class members
    }
}

