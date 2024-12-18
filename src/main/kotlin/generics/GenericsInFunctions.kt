package generics

fun main() {
    val sum = 2 + genericFun(9)
    println("sum of generic = $sum")
    ///////////////////////////////////

}

fun <T> genericFun(a : T) : T {
    println("param a = $a")
    return a
}

//later
fun <T, R, S> genericFun(a: T, b: R, operation: (T, R) -> S): S {
    println("Parameter a = $a")
    println("Parameter b = $b")

    val result = operation(a, b)

    if (result == null){
        println("The result is a null")
    } else {
        when (val nonNullResult = requireNotNull(result)) {
            is Int -> println("The result is an Integer: $nonNullResult")
            is String -> println("The result is a String: $nonNullResult")
            else -> println("The result is of type ${nonNullResult::class.simpleName}: $result")
        }
    }

    return result
}
