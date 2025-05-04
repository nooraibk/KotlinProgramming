package classes

fun main(){

    val obj1 = FirstClass()
    obj1.firstParentFunction()
    obj1.secondParentFunction()

    val obj2 = SecondClass("String for Second Class")
    obj2.firstParentFunction()
    obj2.secondChildFunction()
}


open class FirstClass{//in kotlin, every class is final by default, so you have to use open keyword to allow inheritance
    open fun firstParentFunction(){ //you have to use open keyword to allow overriding of the parent functions

        println("First Function from First Parent Class")
    }

    fun secondParentFunction(){
        println("Second Function from First Parent Class")
    }

}

class SecondClass(val mString: String): FirstClass() {
     override fun firstParentFunction() {
        println("Overridden Function from Second Class")
    }

    fun secondChildFunction() = println("String from second child function where parameter = $mString")
}