package designpatterns.delegation

import kotlin.properties.Delegates

fun main() {
    val obj = KotlinDelegates()
//    obj.observableDelegate = 4
//    obj.observableDelegate = 6
    println("actual value of conditionalDelegate ${obj.conditionalDelegate}")
    obj.conditionalDelegate = 11
    println("actual value of conditionalDelegate ${obj.conditionalDelegate}")
    val obj1 = KotlinDelegates()
    obj1.conditionalDelegate = 8
    println("actual value of conditionalDelegate ${obj.conditionalDelegate}")
    obj1.conditionalDelegate = 20
    println("actual value of conditionalDelegate ${obj.conditionalDelegate}")
}


class KotlinDelegates{
    var runTimeInt = 9
    val lazy : Int by lazy(LazyThreadSafetyMode.SYNCHRONIZED) { runTimeInt }

    var observableDelegate : Int by Delegates.observable(0){property, oldValue, newValue ->
        //for more about property param, please look into KProperty class inside kotlin refelection package
        println("observing : property ${property.name} old $oldValue new $newValue")
    }

    //vetoable delegate works on the basis of conditions
    //for example in this case the values will be assigned to the variable conditionalDelegate only if it is greater than or equal to 10
    var conditionalDelegate : Int by Delegates.vetoable(10){property, oldValue, newValue ->
        println("vetoable : old $oldValue new $newValue")
        newValue >= 10
    }

}