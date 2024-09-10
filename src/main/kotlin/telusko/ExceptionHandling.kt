import java.lang.NumberFormatException

fun main(){
    var str = "4a" //because now the variable contain alphanumber instead of numeric, it cannot be assigned to and Int variable hence will through exception
    var num = try {
        str.toInt()
    }catch (e: NumberFormatException){
        -1
    }

    num++

    println(num)

}