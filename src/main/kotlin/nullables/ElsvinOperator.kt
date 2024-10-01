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

    var st: String? = null
    var st1: String? = "Hello World"
    var len1:  Int = if (st != null) st.length else -1
    var len2:  Int = if (st1 != null) st1.length else -1
    println("Length of st is ${len1}")
    println("Length of st1 is ${len2}")


    //same above code can be written with Elvis operator as

    var str: String? = null
    var str1: String? = "Hello World"
    var leng1:  Int = str ?.length ?: -1 //use of elvis operator
    var leng2:  Int = str1 ?.length ?:  -1

    println("Length of st is ${leng1}")
    println("Length of st1 is ${leng2}")
}