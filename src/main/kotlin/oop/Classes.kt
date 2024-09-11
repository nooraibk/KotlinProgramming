package oop

fun main() {
    val user = User() //this step is called instantiation
    //val user: User = User() //you can also define the class of the object explicitly but just like normal variable types, you don't need it when you're assigning the value ot a variable on declaration time.
    println("Name = ${user.name}")
    println("Age = ${user.age}")

    val car = Vehicle(2, "motor cycle")
    println("Type of Vehicle = ${car.type}")
    println("Number of Tyres = ${car.numberOfTyres}")

    val initExample = InitExample("   ", 30)
}

class User{
    var age = 20
    var name = "henry"
}

class Vehicle(numberOfTyres: Int, type: String){
    var numberOfTyres = numberOfTyres
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