fun main(){
    for(i in 1..10){
        if(i < 7 && i > 4){
            println("-")
            continue
        }
        println(i)
    }

    /**the above if statement can also be written as*/
    for (i in 1..10){
        if (i in 5..6){ //this is same as range check and can be auto changed using "ALT+Enter"
            println("#")
            continue
        }
        println(i)
    }

    /**Another way of defining range is also as follows, and we also discussed it in loops topic*/

    for (i in 1..10){
        if ((4..7).contains(i)){
            println("--")
            continue
        }
        println(i)
    }

    /** you can also use not operator "!" along with range check*/

    for (i in 1..10){
        if (i !in (3 until 9)){ //or simply if (i !in 3..9)
            println("*")
            continue
        }
        println(i)
    }

    /** if there is only one statement after "if" or "else" block then you can also make one line if else statement*/

    for(i in 1..10){
        if (i in 4..7) print("**") else print("##")
        println(i)
    }

    /** if there is only one statement after if or else check then it can also be used as return value. but in this case else is mandatory*/
    for (i in 10 downTo 1){
        var str = if (i in 4..7) "String Value" else 44
        println(str)
    }

    /** you can also use if else normally and can have its return value saved in an expression. in that case you must define the else statement and the last statement of both if and else statement must be a return value that you want to store in the variable.*/

    for (i in 1..10){
        var str = if (i in 3..7) {
            print("-")
            ">>"
        }else {
            print("*")
            "<<"
        }
        println("$str $i")
    }

    /** in case of multiple if else statements, the conditions are checked on the base of their order. So, even the following if also return true, it will be omitted if first "if" statements has already returned true.*/

    for (i in 1..10){
        if (i == 1){
            print("-")
        }else if (i !in 4..7){
            print("->")
        }else{
            print("-*")
        }

        println(i)
    }
}