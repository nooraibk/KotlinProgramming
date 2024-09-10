@file:JvmName("SimpleCoding")

/**the above code changes the byte code file name. You can use the name to as a class reference name to call kotlin functions and other data members.*/

const val PUBLIC_STATIC_FINAL_VAR = "constant variable!!" //this way of writing the name of the variable is called "uppercase snakecase." uppercase because we used all caps, otherwise it would be only snakecase.

//it is equivalent to public static final datamembers of java. it is accessible to any file in the project and cannot be modified.

//# adding const with val keyword tells compiler to ignore the name of the variable altogether and use its assigned value instead, hence increasing the performance. you can only use string and primitive datatypes for const val variable. you can also not use functions return call to assign to the const val variable.

fun main(){
    val text = "Hello, World!"
    println(PUBLIC_STATIC_FINAL_VAR)

    //val is the keyword for the variable that can't be changed later like "final" keyword in java
    //text = ""

    //#when we declare and initialize a variable with "val" keyword at the same time then this type of variable is called literal variable

    var attempt = 1.1

    print("Variable = $text & This is my $attempt attempt. I'll be going to do it ${attempt+1} or ${attempt+2} more times")
    //to print "$" in the print or println function add "\" character before the "$" sign



    myFun()
    dataTypes()
}

fun myFun(){
    println("hello from function")
}

fun dataTypes(){

    //there are total 8 primitive datatypes in Kotlin. those are Byte, Short, Int, Long, Float, Double, Char, Boolean.
    //String is not a primitive datatype

    //we don't need to explicitly define the datatype of a data member because kotlin check the initialization and define the variable type accordingly
    //val text: String = "Hello, World!"

    //you can also add datatype suffix at the end of initialization to tell the compiler to change the default datatype

    val mNumber = 14L //here mNumber will be Long variable while its default type was "Int"
    val mFloat = 3.4F //here mFloat will be Float type while its default type was Double

    val power = 1.1E2F //here default datatype will be Double which will be changed due to F postfix, while E2 means 2 is the exponent of 1.1

    val commaNumber = 2_000_3 //underscore are just the alternative of comma when we normally write. 2_000_3.3 means 2,000,3.3 for compiler it will not print underscore or commas

    println("commaNumber: $commaNumber")

    //#you cannot assign default defined type variable to explicitly defined variable. to do that you have to call type casting function
    //val mExampleNumber: Long = commaNumber

    val mExampleNumber : Long = commaNumber.toLong()

    //char datatype only takes one character as input and is defined by single inverted comma rather than double in case of string datatype

    val charVar = 'l'
    val booleanVar = true


    //to only declare a variable and not define it, you must define the variable on declare time because compiler will not be able to judge the datatype of the variable without initialization.

    val intVar: Int
    intVar = 4

    print("intVar: $intVar") // you cannot use a data member in kotlin without initializing it. e.g. you cannot use null data members in kotlin
}