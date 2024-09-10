fun main(){
    val obj = Person(2, "Ali", 28)
    println(obj.id )
}

data class Person(
    var id: Int,
    var name: String,
    var age: Int
)