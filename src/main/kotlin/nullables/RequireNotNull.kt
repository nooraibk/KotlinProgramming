package nullables

fun main() {
    val xyz : Int? = null
    requireNotNull(xyz){"input must not be null"}

    //you can use requireNotNull function on the place of not-null assertion operator to convert a nullable into not null type but before that you have to make sure that the passing value is must not null otherwise it will throw an exception.

//    println(requireNotNull(xyz))
}