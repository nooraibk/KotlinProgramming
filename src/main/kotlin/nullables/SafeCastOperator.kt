package nullables

/**
 * You can use the as? operator for safe casts. It tries to cast a value to the specified type and returns null if the value is not of that type:
 */


fun main() {
    val intOne : Any = 29

    val notNullInt : Int? = intOne as? Int
    val notNullString : String? = intOne as? String

    println("Integer cast = $notNullInt, String cast = $notNullString")
}