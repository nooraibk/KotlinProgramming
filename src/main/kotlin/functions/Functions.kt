fun main(){
    greet("Henry", 3)
    println(singleExpression())
    //defaultParameters("Henry")
    defaultParameters("Henry", 3) //the value of default parameters can be changed using named arguments.
    namedParameters(name = "Henry", 3, bool = true)// you can skip any explicit named arguments as long as they are in the same order as parameters are declared in the function
    namedParameters(bool = false, name = "Hans") //to change the arguments order, you must call named parameters in the place of arguments.V

}

//in kotlin, we have Unit datatype that replace void from java. but unlike java where void means no return type, Unit is actually a datatype but a datatype that contains nothing.

/**considering the single expression function, you can also write the telusko.codinginflow.functions.telusko.datastructures.functions.telusko.main function that only has one statement, as follows.

fun telusko.codinginflow.functions.telusko.datastructures.functions.telusko.main() = println("hello world")*/

/**until parenthesis,function part is called header & the curly brackets part of the function is called body. The defined variables inside parenthesis are "val" not "var" and are called parameters (which are placeholders) whereas where you call the function and pass the values for the parameters, are called arguments. for instance, name and mNumber are parameters and val variables whereas Henry and 3 are arguments*/

fun greet(name: String, mNumber: Int) {
    for (i in 0 until mNumber){
        println("hello $name")
    }

    var j =4
    while(j > 0){
        println("hello again $name")
        //mNumber-- //as mNumber is val nor var, it cannot be reassigned like in java. for this purpose you need to create a new variable
        j--
    }
}

fun singleExpression(): Int = 3 //this type of function which only contains one expression to return, is called single expression function. single expression function can only contain single return statement started by equal sign =. you can also exclude type casting (: Int) and directly initialize using equal sign =.

/**the above function can also be written as follows
 *
 * fun singleExpression(): Int{
 *  return 3
 * }
 */


//default parameters

//the default arguments are used when you want to keep certain parameters as constant but do not want to overload a function

fun defaultParameters(name: String, mNumbers: Int = 1){ // the value of mNumber can be changed on function call
    println("name = $name, where Number = $mNumbers")
}

fun namedParameters(name: String = "Howard", mNumber: Int = 2, bool: Boolean = false){
    println("Name = $name, and Number = $mNumber, and boolean value = $bool")
}

