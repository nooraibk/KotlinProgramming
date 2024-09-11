fun main(){
    mForLoop()
//    mWhileLoop()
}

fun mForLoop(){
    val arrNumbers = arrayOf(4, 3, 5, 55, 2, 31, 44, 99)

    for (i in arrNumbers){
        println(i)
    }

    //you can also loop through a single String but that will be printed in "Char" sequence

    val arrString = "Hello, World!"
    for (i in arrString){
        println(i)
    }

    //this is how to loop through a range of numbers in kotlin

    for (i in 1..10){
        println(i)
    }

    //below loop will give the same results as above except it will exclude the last element from the until range

    for (i in 1 until 10){
        println(i)
    }

    //below code will run through range in backwards manner

    for (i in 10 downTo 1){
        println(i)
    }

    //below code will run through the range but will skip iterations by the given number. try changing the step value

    for (i in 1..10 step 2){
        println(i)
    }

    //the above .. operator can also be called by its function name as below

    for (i in 1.rangeTo(11) .step(2)){
        println(i)
    }

    //hence, you can use any operator through its function call

    for (i in 10 .downTo(1)){ //for downto operator
        println(i) //and it will give the same result as >_ for(i in 10 downTo 1)
    }

    //you can also typecast a variable inside a loop using datatype prefix

    for(i in 1..10L){ //here the result will take no effect however the datatype of the range will be changed from Int to Long
        println(i)
    }

    //you can also define range using characters

    for (i in 'a'..'f' step 2){ //this will print a to f alphabets by skipping by 2
        println(i)
    }

    //this is how to print each element against its index value

    for (i in arrNumbers.indices){
        //in kotlin "for loop," the iterating variable get initialized with the given range number on each iteration. so giving simple array name will initialize the iterating variable (here i for instance) with the values inside of the array. however, using .indices operator will give the range of array i.e, 0..n where "n" is the length of the array.

        println("Index =  $i Element = ${arrNumbers[i]}")
    }

    //you can also use below code as above to print above output (array against their index numbers

    val num = arrayOf(1,3,4,6,9)
    for ((i, j) in num.withIndex()){
        println("$i : $j")
    }
}

fun mWhileLoop(){
    var i = 0
    var j = 0
    outer@ //label declaration
    while (i < 5){
        println("Hello While!")
        i++
        var f = 0

        do {
            println("hello from inner loop")
            f++
            break //this will target for the label
        }while (f < 5)

    }

    do{
        println("Hello from Do While")
        j++
    }while (j<5)

    //** below is the code for counting a number how many times it can be divided by another number until its value is less than 1
    var mNumber = 8
    var mCounter = 0

    while (mNumber > 1){
        mNumber /= 2
        mCounter++
    }
    println(mCounter)
}