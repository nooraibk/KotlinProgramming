fun main(){
    var obj1 = Professional()
    obj1.skill = "Programming"
    obj1.show()

    var obj2 = Professional()
    obj2.skill = "Designing"
    obj2.show()

    var obj3 = obj1.plus(obj2)
    obj1.show() //you can use any Professional() object either obj1, obj2
}

/**
 * This type of function in kotlin is called extension function, and you can assign the function to any predefined class.
 * You can even access the method in the class itself like a normal class function.
 * To create extension function, you just need to put class reference before function name while defining the header of the function.
 */

fun Professional.plus(obj: Professional) :String{
    var skillObj = Professional()
    skill = this.skill + " & " + obj.skill

    return skill
}

class Professional{
    lateinit var skill : String

    fun show(){
        println(skill)
    }
}