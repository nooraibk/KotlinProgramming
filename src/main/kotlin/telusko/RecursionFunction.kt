fun main(){
    //show()
    //fact()
    println(recursiveFact(5))
}

//recursion function is one which call itself. in this case it will be infinite call

fun show(){
    println("This is Recursion Function")
    show()
}

//simple factorial function

fun fact(){
    var num = 5
    var fact = 1

    for (i in 1..num){
        fact *= i
    }
    println(fact)
}

//doing factorial using recursion function

fun recursiveFact(num :Int) :Int{
    return if (num == 0) 1
    else num * recursiveFact(num -1) // 5 * 4! -> 4 * 3! and the factorial goes on
}