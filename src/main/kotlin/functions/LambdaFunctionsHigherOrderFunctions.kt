package functions

import classes.ArithmeticOps

fun main(){

    //**you can also look into the image example. the example explains how a simple function is translated into lambda expression.

    //lambda functions are just anonymous functions where -> sign represents return type
    //below is just simple lambda function. You can check the return type by pressing CTRL+SHIFT+P on curly brackets

    val fun1 = {x: Int, y: Int -> x+y} //this lambda function just receive two variables and return their sum. the part after arrow is said to be body

    println(fun1(2,1))

    //down below is a multiline lambda. note that whatever last value will be, it will be the return type of the lambda expression

    val fun2 = {
        println("Simple Multiline Lambda Function")
        2+4
    } //as the last value is sum that is Int, so return type of the lambda will also be Int.

    //and hence fun1,fun2.. are although declared as a variable, but it is saving a function and its return value

    fun2() //this will run lambda body

//    println(fun2()) //this will run lambda body and also print the return value


    //as you can see the return type of lambda by pressing CTRL+SHIFT+P on curly brackets, you can also explicitly use the same type while declaring the variable in which you want to save the lambda. for example the below lambda can be explicitly called

//    {x: Int -> x*x}

    //as

    val fun4: (Int)-> Int = {x -> x*x} //here the fun4 type is a lambda that accept Int as an argument and return Int type. the same as fun3

    println(fun4(2)) //2*2 = 4, the return of lambda fun4()

    //single parameter lambdas can further be simplified using "it"

    val fun5: (Int) -> Int = {it * it}
    //or can also be written as
    // val fun5: (Int) -> Int = {it -> it * it}

    //it is a default variable provided by kotlin for single parameter lambdas. you can ignore the parameter variable declaration and simply proceed to the lambda expression body. you can use it key word as a placeholder for anonymous parameter. in short fun5 is same as fun4, just you don't have to declare x and simply proceed to the body using it placeholder. it automatically declares the single parameter based on the expected type

    println(fun5(2)) //2*2 = 4, the return of lambda fun5()


    comboFunction(2,3,{ x, y -> x+y}) //to check the result you can put it in println()

//    println(comboFunction(2,3,{ x, y -> x+y}))  //just like normal lambda expression, if it is in arguments, then you will initialize lambda as you would normally do to lambda body

    //further, if the lambda argument is the last argument of the function then it can be moved out of the arguments body and be initialized outside of arguments body
    comboFunction(2, 3){ i, j -> i*j} //to check the result you can put it in println()

//    println( comboFunction(2, 3){ i, j -> i*j})


    val arithmeticOps = comboSecondFunction(ArithmeticOps.ADD)
    println(arithmeticOps(2, 2))

    //or
    println(comboSecondFunction(ArithmeticOps.ADD)(2, 2))

    lambdaValueToVariable { "Hello Kotlin" }

}

// the below function accept three arguments and return and Int type. first two arguments are simple Int type and the third one is a lambda. this lambda declaration is exactly same as above fun4() and fun5() where we explicitly declared lambda type

//this is also called higher-order function. a higher order function is that, that either accept function as an argument, return a function, or does the both. in this case because comboFunction is accepting lambda as a function argument, hence it will be called as a higher-order function
fun comboFunction(a: Int, b: Int, mFun: (Int, Int) -> Int): Int{
    return mFun(a, b) //this will return the mFun lambda with the value of first two parameters of comboFunction() which are "a" and "b"
}

fun comboSecondFunction(operation : ArithmeticOps) : (Int, Int) -> Int{
    return when(operation){
        ArithmeticOps.ADD -> {a , b -> (a + b)}
        ArithmeticOps.SUBTRACT -> {a , b -> (a - b)}
        ArithmeticOps.MULTIPLY -> {a , b -> (a * b)}
        ArithmeticOps.DIVIDE -> { a, b -> (a / b)}
    }
}

fun lambdaValueToVariable(message: () -> String){
    val msg = message()
    println(msg)
}