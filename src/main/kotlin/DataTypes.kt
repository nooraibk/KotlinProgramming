
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