package nullables

fun main() {
    val xyz : Int? = null
    val zbc : Int = 0
    val abc : Int = requireNotNull(xyz){"input must not be null"}

//    println(requireNotNull(xyz))
}