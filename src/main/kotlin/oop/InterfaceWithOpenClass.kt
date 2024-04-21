package oop

fun main(){
    val obj1 = MyFirstClass("Passing Class Argument for the First Time","Passing Interface Argument for First Time")

    obj1.secondInterfaceFunction("Passing Function Arguments in Interface Function")
    obj1.firstInterfaceFunction()
    obj1.firstFunctionFromFirstClass()

    val obj2 = object: MyFirstClass("Passing Class Parameters for the Second Time","Passing Interface Argument for the Second Time"){
        override fun secondFunctionFromFirstClass() {
            println("Overridden Second Function From First Class")
        }
    }

    //val obj2 = object: MyFirstClass("Passing Class Parameters for the Second Time","Passing Interface Parameter for the Second Time"){}

    obj2.secondFunctionFromFirstClass()

}



interface FirstInterface{
    var firstProperty: String

    fun firstInterfaceFunction()

    fun secondInterfaceFunction(mString: String){
        println("interface function with parameter initialized as $firstProperty")
        println("interface function with parameter passed as $mString")
    }
}

open class MyFirstClass(val classArguments: String, override var firstProperty: String): FirstInterface{
    override fun firstInterfaceFunction() {
        println("First overridden function of Interface")
    }

    fun firstFunctionFromFirstClass(){
        println("This is first function of first class with parameter as $classArguments")
    }

    open fun secondFunctionFromFirstClass(){
        println("Second Function From First Class")
    }

}