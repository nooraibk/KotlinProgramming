fun main(){
    var obj = C()

    obj.aFunction()
    obj.bFunction()
    obj.showA()
    obj.showB()
    obj.showABC()
}

//there is no logical difference between interface and abstract class
interface A {
    fun aFunction()
    fun showA(){
        println("ShowA")
    }

    open fun showABC(){
        println("ShowABC A")
    }
}

interface B {
    fun bFunction()
    fun showB(){
        println("ShowB")
    }

    open fun showABC(){
        println("ShowABC B")
    }
}

class C : A,B {
    override fun aFunction() {
        println("overriding aFunction")
    }

    override fun bFunction() {
        println("overriding bFunction")
    }

    override fun showABC() { //when you have method of same name in more than one parent interface or class then you must override it in order to remove ambiguity
        super<B>.showABC() //you can also call specific parent function by using super keyword

        //println("ShowABC C")
    }
}