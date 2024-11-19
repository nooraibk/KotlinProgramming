package accessmodifiers

//Access modifiers are called visibility modifiers in kotlin
//There are four visibility modifiers in Kotlin: private, protected, internal, and public. The default visibility is public.

/**
 *  If you don't use a visibility modifier, public is used by default, which means that your declarations will be visible everywhere.

    If you mark a declaration as private, it will only be visible inside the file that contains the declaration.

    If you mark it as internal, it will be visible everywhere in the same module.

    The protected modifier is not available for top-level declarations.
 */

val test1 = 1 //default

private val test2 = 2

internal val test3 = 3

protected val test4 = 3 //not available to top level declaration

fun main() {
    test2
}

open class TestClass{
    protected val test4 = 4
    inner class InnerTestClass{
        fun abc(){
            test4
        }
    }

    class NestedTestClass{
        fun abc(){
            test4
        }
    }
}

class InheritingTestClass{
    fun classFun(){
        println(test4) // cannot access as protected by "protected" keyword
    }
}