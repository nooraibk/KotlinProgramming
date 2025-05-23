package classes

fun main(){
    var obj1 = Vehicle("Car")
    obj1.show()

    SecondaryConstructors() //this will only instantiate the object with primary constructor which will only call the init block
    SecondaryConstructors("Car", "Vehicle") //this will the object instantiate by the secondary constructor which will also call init block
}

class Vehicle(name : String){ //the constructor here will be primary constructor and the keyword "constructor" is optional
    var mName = name

    fun show(){
        println(mName)
    }
}

//secondary constructor and init blocks

class SecondaryConstructors(){
    init {
        println("init block")
    }

    constructor(name: String, type: String) : this(){
        println("Vehicle Name: $name .. Vehicle Type $type")
    }
}