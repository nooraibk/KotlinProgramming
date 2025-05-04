package oop

fun main() {
    val user = User() //this step is called instantiation
    //val user: User = User() //you can also define the class of the object explicitly but just like normal variable types, you don't need it when you're assigning the value ot a variable on declaration time.
    println("Name = ${user.name}")
    println("Age = ${user.age}")

    val car = College(2, "motor cycle")
    //car.numberOfTyres //numberOfTyres is a local immutable property of the class and is not accessible outside the class scope
    println("Type of Vehicle = ${car.type}")
    println("Number of Tyres = ${car.pubNumberOfStudents}")

    InitExample("   ", 30)
}

class User{
    var age = 20
    var name = "henry"
}

class College(numberOfStudents: Int, type: String){ //numberOfTyres and type are constructor params
    var pubNumberOfStudents = numberOfStudents
    var type = type
}

//the above class can also be declared as follows

//class Vehicle(var numberOfTyres: Int, var type: String)

class InitExample(name: String = "No Name", var age: Int){
    init {
        print("Age = $age")
    }

    var name: String

    init {
        if (name.isBlank()){
            this.name = "No Name"
        }else{
            this.name = name.trim()
        }

        println(" Name = ${this.name}")
    }
}

//------------------------SUPER KEY WORD------------------------------------------



/**
 * Super keywords can be used to invoke the members of the parent class in the child class.
 * In the example below, the child class invokes drive() and noOfSeats properties using the super keyword.
 * */


open class Vehicle(name: String, modelNumber: String, color: String) {
    val numberOfSeat = 3

    open fun drive() {
        println("Let's drive a vehicle")
    }
}

class Car(val name: String, val modelNumber: String, val color: String) : Vehicle(name, modelNumber, color) {

    fun visitPlaces() {
        println("Let's visit places in our new car. We have ${super.numberOfSeat} seats")
    }
}


/**
 * Super keyword can also be used to invoke the constructor of the parent class from the secondary constructors of the child class.
 */

open class VehicleTwo(name: String, modelNumber: String, color: String) {
    val numberOfSeat = 3

    open fun drive() {
        println("Let's drive a vehicle")
    }
}

class CarTwo : VehicleTwo {

    constructor(name: String, modelNumber: String, color: String) : super(name, modelNumber, color)

    fun visitPlaces() {
        println("Let's visit places in our new car. We have ${super.numberOfSeat} seats")
    }
}

/**
 * It can also be used to resolve the overriding conflicts.
 * When we inherit from the two parent classes, which consist of methods with the same name, then we must specify which superclass’s implementation that we want to use using the super keyword.
 */

open class VehicleThree(name: String, modelNumber: String, color: String) {

    open val numberOfSeat = 4
    open fun drive() {
        println("Let's drive a vehicle")
    }
}

interface Instrument {
    fun drive()
}

class CarThree(val name: String, val modelNumber: String, val color: String) : VehicleThree(name, modelNumber, color),
    Instrument {

    override fun drive() {
        super<VehicleThree>.drive()
        println("Let's drive $name $modelNumber car of $color color")
    }

    fun visitPlaces() {
        println("Let's visit places in our new car. We have ${super.numberOfSeat} seats")
    }
}