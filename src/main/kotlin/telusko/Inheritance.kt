fun main(){
    var obj1 = Human()
    obj1.work()
    obj1.eat()
}

open class LivingBeings{ //in kotlin, every class is final by default, so you have to use open keyword to allow inheritance
    open fun work(){ //you have to use open keyword to override the parent functions
        println("Parent Function")
    }

    fun eat(){
        println("Parent Eats")
    }
}

class Human: LivingBeings(){
    override fun work(){ // you have to use override keyword to override the parent functions
        println("Human Function")
    }
}