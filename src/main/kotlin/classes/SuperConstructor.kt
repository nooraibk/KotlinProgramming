package classes

fun main(){
    var obj = School("High School") //the primary constructor of School class will accept the arguments
    obj.job()
}

open class Institute(instituteName :String){
    init {
        println("Institute Init $instituteName")
    }

    open fun job(){
        println("Parent Institute")
    }
}

class School(name :String): Institute(name){ //name will act as an argument for parent class constructor i.e., instituteName.
    //in inheritance first parent init block and parent constructor is run then the child. This is how to override super method like in java.
    init {
        println("School Init $name")
    }

    override fun job(){
        println("School Job")
    }
}