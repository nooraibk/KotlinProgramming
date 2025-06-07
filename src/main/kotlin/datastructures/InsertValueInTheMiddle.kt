package datastructures

fun main() {
    insertValuesInTheMiddle()
}

fun insertValuesInTheMiddle() {
    val arrayOne = arrayOf("ab", "c", "df", "e")
    val arrayTwo = arrayOf("p", "qr", "s")
    var finalList = listOf<String>()
    var str = ""
    for (i in arrayOne.indices) {
        if (arrayOne[i].length == 2) { // (arrayOne[i].length % 2 == 0) // if we want to check for even and odd values, i.e, want to insert values in the string of 4 characters
            str = "$str ${arrayOne[i][0]} ${arrayTwo[i]} ${arrayOne[i][1]}"
        }

        if (i < (arrayTwo.size)) { // this will ensure the last item index will not crash. also make sure to use the array with the largest length to iterate on
            if (arrayTwo[i].length == 2) {
                str = "$str ${arrayTwo[i][0]} ${arrayOne[i]} ${arrayTwo[i][1]}"
            }
        } else {
            str = "$str ${arrayOne[i]}"
//            println("final string = $i ${arrayOne[i]}")
        }
    }

    println("final string = ${str}")
}