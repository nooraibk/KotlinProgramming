package dsl

fun main(){

    fun I.extendingInvoke() {
        println(invoke("iParams for Invoke") + " and extending i class")
    }
    println(I()("iParams for Invoke")) //prints invoke()
    I().extendingInvoke() //calls extension function

    val iLambda: I.(Int) -> Int = {
        it + value
    }

    println(I().iLambda(4))

    val instance = J(10)
    val lambda: J.() -> Unit = {
        increment()
        value += 10
    }

    instance.lambda()  // Invoke the lambda with the instance as the receiver
    println(instance.value)  // Output: 11


    val sum = K(6)(6)
    println(sum)

    iLambda {
        println("return statement ${this.value} $it")
    }

    println(kotlin.text.buildString {
        append("<")
        append("Hello World!")
        append(">")
    })
}

class I{
    operator fun invoke(iParam : String) = "invoking class dsl.I $iParam"

    var value: Int = 2
}

class J(var value : Int) {

    fun increment() {
        value++
    }
}

class K(var i : Int){
    operator fun invoke(num : Int) : Int{
        return num + i
    }
}

fun iLambda(i : I.(Int) -> Unit){
    println("executing lambda " + I().i(4))
}

fun buildString(action: (StringBuilder).() -> Unit): String {
    val stringBuilder = StringBuilder()
    action(stringBuilder)
    return stringBuilder.toString()
}
