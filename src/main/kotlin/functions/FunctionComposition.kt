package functions

fun addOne(value: Int): Int {
    return value + 1
}

fun doubleValue(value: Int): Int {
    return value * 2
}

//val composedFunction: (Int) -> Int = (::addOne) . (::doubleValue) //todo https://medium.com/codex/mix-up-your-kotlin-functions-with-function-composition-c0f635d40c87

fun main() {
//    val result = composedFunction(5)
//    val abc= requireNotNull(result)
//    println(result) // Output: 12 (5 + 1 = 6, 6 * 2 = 12)
}