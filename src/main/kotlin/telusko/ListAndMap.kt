import java.util.*

fun main(){
    mList()
    mMap()
}

fun mList(){
    val num = listOf(1, 3, "ahd", 'j', 2.9, false)
    for ((i, j) in num.withIndex()){
        println("$i : $j")
    }
}

fun mMap(){
    val num = TreeMap<String, Int>()
    num["Game"] = 2
    num["Work"] = 4

    for ((i, j) in num){
        println("$i : $j")
    }
}