
// Property Access Syntax refers to the getter and setter

fun main() {
    val person = Alien()
    println(person.name) // Output: Getting name John
    person.name = "Jane" // Output: Setting name to Jane

    val rectangle = Rectangle(2, 2)
    println("Rectangle Area = ${rectangle.area}")
}

class Alien {
    var name: String = "John"
        get() {
            print("Getting name ")
            return field
        }
        set(value) {
            println("Setting name to $value")
            field = value
        }
}

class Rectangle(var width: Int, var height: Int) {
    //setting can only be applied to var/mutable variables and variable must also have been initialized already
    var area: Int = 0// property type is optional since it can be inferred from the getter's return type
        get() = this.width * this.height
        set(value) {
            width = value/2
            height = value /2
            field = value
        }

    val name
        get() = {
            "Box of size ${width * height}"
        }
}