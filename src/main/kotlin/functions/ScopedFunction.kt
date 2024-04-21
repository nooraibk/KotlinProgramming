package functions

/*
+---------------------------------------------
| Function | Context Object | Retunpm --versionrn Value   |
----------------------------------------------
| let      | it             | lambda result  |
+---------------------------------------------
| run      | this           | lambda result  |
+---------------------------------------------
| with     | this           | lambda result  |
+---------------------------------------------
| apply    | this           | context object |
+---------------------------------------------
| also     | it             | context object |
+---------------------------------------------
 */

//Scoped Functions are utility functions from kotlin
var nullCheck: Int? = null


fun main() {


//---------------------LET----------------------------------------


//    val obj = Square(24, 24).let {
//        it.fillColor("Red")
//        it.addText("Let Function with Lambda Return")
//        it
//    }

    //

    val objLet = Square(24, 24).let { squareObj -> //we can also rename it to any other variable name
        squareObj.fillColor("Red")
        squareObj.addText("Let Function with IT as context object/reference Lambda Return")
//        squareObj //returning the object is necessary in this case to initialize it. otherwise Lambda expression will return default "Unit" type and will just execute the commands inside "let" body. returning the Lambda result will actually return object with initialized values
    }
    //this will just execute the block with the reference of the caller (in this case Square() class)


    println(objLet) //you can also omit explicit .toString as we have overridden default .toString, so it will automatically call .toString

    /**
     * let function is usually used for null safety
     *
     * let's assume we have a late init var coming from somewhere else, and it can be or cannot be null
     */

    lateinit var square: Square

    val objLet1: Square? = null

    objLet1?.let {
        square = it
    }
    println(objLet1)


//---------------------USE of LET----------------------------------------

    //null safety check example

    if (nullCheck != null) {
        //val number = nullCheck +1

        /** as we have declared nullCheck number az global, then it is possible that even after checking for not null in if condition, the nullCheck variable will get initialized if accessed from somewhere else.
         * so it is possible that when we checked the variable on if statement it was null, but there was some other instances that were accessing the nullCheck variable, so before we assigned val number, the value of nullCheck variable again set to null by some other instances.
         * hence kotlin is a null safe language, so we cannot perform this operation
         */

    }


    //to solve the issue we uses let


    nullCheck?.let {
        val number = it + 1

        /**
         * first the block will only get executed if the nullCheck is null. question mark operator ? does this job.
         * so the let block will only get executed if nullCheck is null, however it is same as above if condition.
         * it works particularly because, let block sort of save the value of nullCheck at the time of execution.
         * as let uses "it" as a context object and return lambda value (in this case, same "it" value), "it" gets initialized with initial value of nullCheck
         * so, even if there is a chance that value of nullCheck might get initialized null via some other instance, due to nullCheck being a global variable, "it" in let block execute it with the initially saved value in "it"
         */
    } ?: 2 //if we are taking question mark as if block then elvis operator can be used for else block


    //we can also write above let as
    val number = nullCheck?.let {
        it + 1
    }



    println("--------------------RUN ENDS-----------------------------------")
//---------------------RUN----------------------------------------

    val objRun = Square(
        24,
        26
    ).run { //as "run" uses "this" as context object, we cannot rename this. however, unlike "it." we can omit "this." for calling members and can call them directly.

        addText("Run Function with THIS as context object/reference and lambda as return type")
        fillColor("Blue")
        this
    }
    println(objRun)
    println("----------------------RUN ENDS---------------------------------")


//---------------------WITH----------------------------------------
    val objWith = Square(24, 25)
    with(objWith) { //with is usually used when we have many properties of an object to call. so putting object reference before each property can become tedious
        addText("With Function with THIS as context object/reference and Lambda as return type")
        fillColor("Green")
    }
    println(objWith)
    println("----------------------WITH ENDS---------------------------------")

    //on above two examples we are anonymously calling LET and RUN functions, that means there is no object (an object with stored values) reference. So we had to return initialized anonymous object to objLet and objRun to pass anonymous values. but here we first initialized objWith with a constructor and then by using that initialized object, we called "with" to initialize two other properties. as we already had an initialized object so we ddo not have to return "THIS" as Lambda expression.


//---------------------APPLY----------------------------------------
    val objApply = Square(
        25,
        55
    ).apply {//apply return type is the same context object which is referring apply. in this case Square()
        addText("APPLY Function with THIS as context object/reference and same Context Object as return type")
        fillColor("Orange")
    }
    println(objApply)
    println("----------------------APPLY ENDS---------------------------------")


//---------------------ALSO----------------------------------------


    //ALSO is almost same as APPLY, here you just have to explicitly call members using context object that is "IT" (THIS reference object is not required for explicit casting

    //ALSO is similar to LET as well, but in case of also, you will not have to return IT. instead, the object that called ALSO will be returned as context object.

    val objAlso = Square(33, 22).also {
        it.addText("ALSO Function with THIS as context object/reference and same Context Object as return type")
        it.fillColor("Purple") //it also has return type same as context object which is referring also. in this case Square()
    }
    println(objAlso)


    //another example to clear difference between ALSO and LET

    var incrementalVar = 2

    val sqIncrementVar = (incrementalVar*incrementalVar).also {
        incrementalVar += it
    }

    println("Increment Var = $incrementalVar AND Square Increment Variable = $sqIncrementVar")


    println("----------------------ALSO ENDS---------------------------------")
}


class Square(
    private var width: Int,
    private var height: Int,
    private var color: String? = null,
    private var text: String? = null
) {
    fun fillColor(color: String) {
        this.color = color
        println(color)
    }

    fun addText(text: String) {
        this.text = text
        println(this.text)
    }

    override fun toString(): String {
        return "Square (width= $width, height= $height, color= $color, text= $text)"
    }
}