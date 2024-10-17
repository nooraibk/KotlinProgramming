/**the above code changes the byte code file name. You can use the name to as a class reference name to call kotlin functions and other data members.*/

const val PUBLIC_STATIC_FINAL_VAR = "constant variable!!" //this way of writing the name of the variable is called "uppercase snakecase." uppercase because we used all caps, otherwise it would be only snakecase.

//it is equivalent to public static final datamembers of java. it is accessible to any file in the project and cannot be modified.

//# adding const with val keyword tells compiler to ignore the name of the variable altogether and use its assigned value instead, hence increasing the performance. you can only use string and primitive datatypes for const val variable. you can also not use functions return call to assign to the const val variable.
val text = "Hello, World!"
//val is the keyword for the variable that can't be changed later like "final" keyword in java
//text = ""

//#when we declare and initialize a variable with "val" keyword at the same time then this type of variable is called literal variable

var attempt = 1.1


fun main(){

    print("Variable = $text & This is my $attempt attempt. dsl.I'll be going to do it ${attempt+1} or ${attempt+2} more times")
    //to print "$" in the print or println function add "\" character before the "$" sign

}