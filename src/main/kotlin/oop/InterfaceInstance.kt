package oop

fun main(){
    val obj1 = InterfaceInstanceClass()
    val obj2 = InheritanceClass()

//    obj1.interfaceInstanceClassFunction("Interface Class Argument")
    obj2.interfaceInstanceFunction("Inheritance Class Argument")
}


class InterfaceInstanceClass{

    lateinit var interfaceInstance: InterfaceInstance //not initialized for the time being

    interface InterfaceInstance{
        fun interfaceInstanceFunction(text: String)
    }

    fun interfaceInstanceClassFunction(text: String){
        interfaceInstance.interfaceInstanceFunction("Moshi Moshi $text")
    }
}

class InheritanceClass: InterfaceInstanceClass.InterfaceInstance{
    override fun interfaceInstanceFunction(text: String) {
        println("Moshi Moshi $text")
    }

}