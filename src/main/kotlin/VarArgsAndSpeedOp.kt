fun main(){

    varargArray(2, 3, 1)

    /**
     * Sometimes we have an existing array instance in Kotlin, and we want to pass it to a function accepting a vararg.
     * In those situations, to decompose the array to a vararg, we can use the spread operator:
     */

    val numbers = intArrayOf(4, 5)
    varargArray(*numbers)

    arrayOf()
    // if you just type arrayOf and wait for autocomplete, it will give you vararg as first argument.

    //The “*” behind the numbers array variable is the spread operator

}

/**
 * vararg is short for variable argument and exactly does the same thing; pass variable number of argument to a FUNCTION
 * vararg creates an array of values with the given type. In this case it will be an array of Int values
 *
 * when the vararg is not the last declared parameter, we should pass other parameters by name to avoid the ambiguity:
 *
 * like
 * createUser("admin", "user", username = "me", age = 42)
 *
 * Each function can have at most one vararg parameter
 */

fun varargArray(vararg values: Int){
    var sum = 0
    for (i in values){
        sum += i
    }
    println(sum)
}