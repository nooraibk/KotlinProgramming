package functions.extensions

fun main() {
//    Student()(){
//        addName("Ali")
//        addMarks(80)
//    }

    val student = Shape()
    student {
        applyShape("Box")
        applySize(80)
    }
}

class Shape {
    operator fun invoke(shape: Shape.() -> Unit) = shape()

    fun applyShape(shape: String) {
        println("dsl.Shape = $shape")
    }

    fun applySize(size: Int) {
        println("Marks = $size")
    }
}