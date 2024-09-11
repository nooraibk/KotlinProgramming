fun main(){
    /**in java if one case returned true, and you didn't break the switch statement, it will execute the next case whether it returns false.
    //when statement is almost similar to Switch statement. But it will terminate after checking if the first condition returns true, and won't check for the next conditions.*/

    var intVar = 8

    when(intVar){
        2 -> println("Variable Value is 2")
        !in 4..8 -> {
            print("Not Included ")
            println("in the Range")
        } 8 -> println("Variable Value is 8")
        else -> println("Executing Else Statement")
    }

    /**just like if statement, when statement can also return value. but in that you must include else statement, just like in if return statement. This is because return value should not be null while initializing a variable and excluding else statement can return null. This will not be mandatory in scenarios like boolean check where you will be checking for both true and false statements. */

    val strVariable = when(intVar){
        3 -> {
            println("hello World!")
            "returned value"
        }else -> "returned value from else"
    }

    println(strVariable)

    /** # to check different expressions rather than using one expression in when(expression) statement, you have to omit expression on "when" declaration and check them separately on each check.*/
    val booleanVar = true

    when{
        intVar > 9 -> println("Variable Integer is greater than 3")
        intVar > 7 && intVar < 9 -> println("Variable Integer is somewhere between 7 & 9")
        booleanVar -> println("The Value of booleanVar is True") //just like if, you can simply put true and false to execute a block of statement.
    }
}