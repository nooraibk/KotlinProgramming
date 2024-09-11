package OOP

fun main(){
    val obj2 = InterfaceClass()
    val obj3 = ImplementationClass()
    val obj4 : InterfaceClass.MInterface

    obj2.callInterfaceFunction()
}



class InterfaceClass{

    lateinit var obj1 : MInterface



    fun callInterfaceFunction(){
        obj1.interfaceFunction("Moshi Moshi")
    }




    interface MInterface{
        fun interfaceFunction(text: String)
    }
}

class ImplementationClass : InterfaceClass.MInterface{
    override fun interfaceFunction(text: String) {
        println()
    }
}

