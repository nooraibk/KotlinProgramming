fun main(){
    var obj = Laptop()
    obj.purpose()
    obj.domain()
}

abstract class Electronics{ //when you make a class of function abstract then there is no need for open keyword
    abstract fun purpose()

    fun domain(){
        println("Domain of Electronic Device")
    }
}

class Laptop :Electronics(){
    override fun purpose(){
        println("Computational Tasks")
    }
}