package classes

fun main(){
    val obj = object: ExtendableOpenClass("Passing First Arguments"){
        override fun ExtendableOpenClassFunction() {
            super.ExtendableOpenClassFunction()
            println("Anonymous/Singleton object with Arguments as $myString")
        }
    }
    obj.ExtendableOpenClassFunction()
}


open class ExtendableOpenClass(val myString: String){
    open fun ExtendableOpenClassFunction() = println("Function from Extendable Open Class with Parameter as $myString")
}