package nullables

fun main(){
    /**
     * Elvis Operator ?:
     * It is used to return the not null value even the conditional expression is null.
     * It is also used to check the null safety of values.
     * In some cases, we can declare a variable which can hold a null reference.
     * If a variable st which contains null reference, before using st in program we will check its nullability.
     * If variable st found as not null then its property will use otherwise use some other non-null value.
     */

//    var str: String? = null
    var str: String? = "Str String"

    val valueOfStr = str?:"Hello World"

    println("Value of str is ${valueOfStr}")
}