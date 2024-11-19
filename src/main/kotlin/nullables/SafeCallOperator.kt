package nullables

fun main() {
//    val obj : NullableOne? = NullableOne()
    val obj : NullableOne? = null
    println("printing x value : ${obj?.x}") //prints the value of x if not null otherwise prints null but either way protects from null pointer exception
}

class NullableOne{
    val x : Int = 0
}
