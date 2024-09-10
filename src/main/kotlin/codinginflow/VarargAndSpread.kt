fun main(){
    //arrayof() if you just type arrayof and wait for autocomplete, it will give you vararg as first argument.
    dynamicArrayFun(2, 4, 3, 5)

}

fun dynamicArrayFun(vararg mNumbers: Int){ //vararg parameter allows to declare dynamic array variable that can take m number of arguments as input.
    for (i in mNumbers){
        println(i)
    }
}