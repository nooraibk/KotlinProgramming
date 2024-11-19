package functions

fun main() {
    val obj1 = AnotherPerson(1, 2)
    val obj2 = AnotherPerson(2, 2)
    println(obj1.toString())
    println(ABC(1))
    println(obj1.equals(obj2))
}

// these three functions are included in every kotlin class
class AnotherPerson(private var varOne: Int, private var varTwo: Int) {

    // == also known as structural equality operator
    override fun equals(other: Any?): Boolean {
        // Check if the reference is the same
        if (this === other) return true

        // Check for null and class type
        if (other == null || javaClass != other.javaClass) return false

        // Cast and compare fields
        other as AnotherPerson
        return (varOne == other.varOne) && (varTwo == other.varTwo)
    }

    override fun hashCode(): Int {
        // Generate a hash code based on fields used in equals
        return 31 * varOne.hashCode() + varTwo
    }

    override fun toString(): String {
        return "AnotherMath(varOne=$varOne)"
    }


}


//these three functions are overridden by default in data class. data class also have copy() function. see Copy function file for more info
data class ABC(
    val iabbb: Int
) {
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}