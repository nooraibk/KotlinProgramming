fun main(){
    println("${true && false}")
    //using && or || for AND and OR operators will short circuit the rest of the condition as soon as the condition is satisfied. for example if true is on the left side of an OR operator than the operator will not check for the rest of the statement as it already returned true. It is also known as statement short circuit by local operators.

    println("${true or false}") //using keywords "and" "or" disable short cicuiting

    println("${true xor false}") //xor return true when both conditions around "xor" are opposite i.e, true and false.  this statement will return true because the condition before "xor" is true. (i'm not sure why i made this note before)

    println("${true xor true}") //this statement will return false
    println("${false xor false}") //this statement will return false

    val condition = 2 > 1 || 3 > 2 && 2 > 3 // this will mean (2 > 1) || (3 > 2) && (2 > 3) and && operator is executed before || operator

    println(condition) //will return true
}