package classes


fun main() {
//    val demo = Outer.Nested().foo() // == 2

}

class Outer {
    private val bar: Int = 1
    class Nested {
//        fun foo() = bar
    }

    inner class NestedInner {
        fun foo() = bar
    }
}

