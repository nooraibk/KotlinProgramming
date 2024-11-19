package functions.extensions

fun main(){
    println("Hello World".formattedString() + "\n******************************************")

    var a = 23
//    a.incrementedNumber()

    println(a.numberToStringAndLength() + "\n******************************************")


    val obj = Profession()
    obj.skill = "Programmer"

    obj.addSkills(obj)
    obj.showSkill()


    // Extension function add defined for dsl.A
    fun A.add():Int{
        return a+b
    }

    // Extension function operate defined for dsl.B
    fun B.operate():Int{
        return a*b;
    }

    // Function to display static dispatch
    fun display(a: A){
        print(a.add())
    }

    // Calling display function
    display(B())
}


/**my old explanation::
 * in kotlin you cannot extend a class unless it is open so adding further functions and variables in a class becomes challenging.
 * by using extension functions you can assign a function to any predefined class reference before function name while defining the header of the function.
 *these functions will be associated to the class they are extending to. Like String extended function can only be called from string object. Int extended function can only be called from Int object.
 *
 * *new explanation*::
 * adding function to an existing class without modifying it
*/
fun String.formattedString(): String{
    return "-------------\n$this"
}

//String class is used because it was called after a string


fun Int.numberToStringAndLength(): String = "The Number= " + this.toString() + " While its Digit Length= " + this.toString().length


class Profession{
    lateinit var skill: String

    fun showSkill() = println(skill)
}

fun Profession.addSkills(obj: Profession): String{
    skill = "Programmer" + " & " + obj.skill
    return skill
}


// Open class created to be inherited
open class A(val a:Int, val b:Int){
    val ans = 0
}

// Class dsl.B inherits dsl.A
class B : A(5, 5)