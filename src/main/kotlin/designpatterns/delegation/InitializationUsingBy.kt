package designpatterns.delegation

import kotlin.reflect.KProperty

fun main() {
    //pending
    val testVar by test
    println(testVar)
}

//pending
class Test {
    //removing ? from thisRef can make it no longer work with functions and top level variables
    operator fun getValue(thisRef: Int?, property: KProperty<*>): Int? {
        return 3
    }
}
var test = Test()

class DelegateClass

/**
 * thisRef param refers to the object that contains the property, in other words, its the object
 * that says i'm not going to handle this property my self
 *
 * thisRef should be type or subtype of calling reference. in other words thisRef can be DelegationClass
 * or parent class of DelegationClass for example Any which is parent of mostly all classes.
 *
 * property param refers to the actual property which is calling the delegate. in this case val delegatedProperty
 * KProperty comes from the reflection package and holds metadata of the delegation property
 */
operator fun DelegateClass.getValue(thisRef : DelegationClass, property : KProperty<*>) : DelegateClass{
    return DelegateClass()
}

class DelegationClass{
    val delegatedProperty by DelegateClass()

//    var secondDelegatedProperty by DelegateClass() //compile time error as no setValue function
    var thirdDelegatedProperty by AnotherDelegateClass()
}

class AnotherDelegateClass{
    operator fun getValue(thisRef : DelegationClass, property : KProperty<*>) : AnotherDelegateClass{
        return AnotherDelegateClass()
    }

    //the third param for set value "value" is used to save a value
    //setValue operator function is also mandatory when you need make a var delegate rather than val
    operator fun setValue(thisRef : DelegationClass, property : KProperty<*>, value : AnotherDelegateClass){
        println("use this value to save it and pass of any type : $value")
    }
}
