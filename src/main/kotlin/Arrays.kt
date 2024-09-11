fun main(){
    var arrDeclaration = arrayOf(Int)
    //arrDeclaration[0] = 1

    println("Array Declaration: $arrDeclaration")

    val arrOne = arrayOf(1, 3)

    println("array of arrOne = ${arrOne[1]}")

    println("Size of arrOne = ${arrOne.size}") //to check the size of an array call builtin .size data member

    val arrTwo = arrayOf("dfdd", "teee", "kkkk")
    arrTwo[0] = "kk4e4"
    /*
    you are not reinitializing "val" variable here, rather changing the already initialized array value. for example you already have a car, and you are not changing the car rather changing its tyres.
     */

    println("first Index of arrTwo = ${arrTwo[0]}")

    val arrThree = arrayOf(3, "hello", 3.1, 'j') //you can define multiple datatype array in kotlin. This is like serialization concept or parcelable concept

    println("Values of arrThree = ${arrThree[2]}")

    val arrFour = arrayOf(arrayOf("as", 4), arrayOf(44, "ee"))

    //you can use array inside of another array hence making multidimensional array

    println("Array Four: ${arrFour[0][0]}")

    val arrFive = arrayOf("Array Number Five")
    //you can use simple string array as a multidimensional array to fetch single character out of a string

    println("Array Five = ${arrFive[0][3]}") //here, the expression type will be "char"
    println("Length of Characters in a String Array = ${arrFive[0].length}") //this expression can be used to check number of characters inside of a string array

    //* to print the last element in an array

    val arrCheckLast = arrayOf(4, 4, 2, 5, 11, 5, 8, 6)

    println("Last element of arrCheckLast = ${arrCheckLast[arrCheckLast.size-1]}")
    println("Last element of arrCheckLast = ${arrCheckLast[arrCheckLast.lastIndex]}") //it will also print the same result as above statement. .lastIndex return the index value of last element
    println("Last element of arrCheckLast = ${arrCheckLast.last()}") //.last function also does the same thing and return value of the last index of an array

    //* # All the above array are object arrays like Integer[] and String[]. To create primitive arrays you have to call primitive array functions of kotlin instead of .array()

    val primitiveArrInt = intArrayOf(4, 4, 5)
}