package functions

fun main() {
    val obj1 = BlogEntry("Test Blog", "Test Description")
    obj1.xyz = 9
    println("obj1 = $obj1 :: ${obj1.xyz}")
    val obj2 = obj1.copy(title = "Second Blog")
    println("obj2 = $obj2 :: ${obj2.xyz}")
    /**
     * In Kotlin, when you create a data class, it automatically provides a copy function. This function allows you to create a new instance of the data class while selectively overriding specific properties. The copy function performs a shallow copy, meaning it only copies the top-level properties and not the nested objects or collections.
     */

    val obj3 = SimpleBlogClass("Simple Blog")
//    val obj4 = obj3.copy
}

data class BlogEntry(val title: String, val description: String){
    var xyz : Int = 0

}

class SimpleBlogClass(val title: String)