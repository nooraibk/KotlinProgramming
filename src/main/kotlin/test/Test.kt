package test

import java.text.DecimalFormat

fun main(){
over()

}

fun over(){
    var number = 0.0F
    var overs = 0.0F
    for (i in 1..80){

        number += 0.1F
        val roundedNumber = DecimalFormat("#.#").format(number).toFloat()

        if (roundedNumber == 0.7F){
            println("test.over finished")
            number = 0.0F
            overs += 1.0F
        }
        println(overs+number)
    }
}