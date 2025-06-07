package datastructures

fun main() {
    var a = 5
    var b = 10

    /**
     * can also be done using other arithmetic operators like * combined with /
     */

    a = a + b  // a becomes 15 (5 + 10)
    b = a - b  // b becomes 5 (15 - 10)
    a = a - b  // a becomes 10 (15 - 5)

    println("a = $a")  // Output: a = 10
    println("b = $b")  // Output: b = 5
}
