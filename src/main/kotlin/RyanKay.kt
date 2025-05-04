/**
 * Problem Statement:
 * -"+"
 * -"-"
 * -"*"
 * -"/"
 *
 * if the first argument of the program matches one of the above Strings [1a], execute the appropriate mathematical function [2a]. Display this result in the console[3a]
 *
 * If the first argument of the program does not match any of the above Strings [1b]. display an error message in the console [2b]
 */

fun main(){
//    val operatorSymbol = readLine()
//
//    if (operatorSymbol != null) {
//        start(operatorSymbol)
//    }

//    myMethod()
//    myAlternateMethod(readLine().toString(), 5.0, 5.0)
}

const val ADD :String = "+"
const val SUB :String = "-"
const val MUl :String = "*"
const val DIV :String = "/"

const val ERROR_MESSAGE = "An error has occurred"

var testOperandOne = 5.0
var testOperandTwo = 5.0

fun start(operatorSymbol: String){
    if (checkArguments(operatorSymbol)){
        displayResult(evaluateBinomial(testOperandOne, testOperandTwo, operatorSymbol))
    }else{
        displayResult(ERROR_MESSAGE)
    }
}

fun displayResult(result :String) = println(result)

fun evaluateBinomial(opOne :Double, opTwo :Double, operator :String) :String{
    return when (operator){
        ADD -> (opOne + opTwo).toString()
        SUB -> (opOne - opTwo).toString()
        MUl -> (opOne * opTwo).toString()
        DIV -> (opOne / opTwo).toString()
        else -> ERROR_MESSAGE
    }
}

fun checkArguments(operatorSymbol: String) :Boolean{
    return when (operatorSymbol){
        ADD -> true
        SUB -> true
        MUl -> true
        DIV -> true
        else -> false
    }
}


fun myMethod(){
    var userInput = readLine()
    var a = 5.0
    var b = 5.0

    when(userInput){
        "+" -> println("${a+b}")
        "-" -> println("${a-b}")
        "*" -> println("${a*b}")
        "/" -> println("${a/b}")
        else -> println("Invalid Input")
    }
}

fun myAlternateMethod(userInput :String, opOne :Double, opTwo :Double){
    when(userInput){
        "+" -> println("${opOne+opTwo}")
        "-" -> println("${opOne-opTwo}")
        "*" -> println("${opOne*opTwo}")
        "/" -> println("${opOne/opTwo}")
        else -> println("Invalid Input")
    }
}