package oop

fun main(){
    val obj2 = InterfaceClass()
    ImplementationClass()

    obj2.callInterfaceFunction() //compile time error because lateinit var obj1 inside InterfaceClass class is not been initialized. uncommenting line 16 does compile it
}



class InterfaceClass{

    lateinit var obj1 : MInterface
//    var obj1 : MInterface = ImplementationClass()



    fun callInterfaceFunction(){
        obj1.interfaceFunction("Moshi Moshi")
    }




    interface MInterface{
        fun interfaceFunction(text: String)
    }
}

class ImplementationClass : InterfaceClass.MInterface {
    override fun interfaceFunction(text: String) {
        println("ImplementationClass:: override fun interfaceFunction")
    }
}

