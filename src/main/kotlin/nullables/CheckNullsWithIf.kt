package nullables

fun main() {
    var st: String? = null
    var st1: String? = "Hello World"
    var len1:  Int = if (st != null) st.length else -1
    var len2:  Int = if (st1 != null) st1.length else -1
    println("Length of st is ${len1}")
    println("Length of st1 is ${len2}")
}