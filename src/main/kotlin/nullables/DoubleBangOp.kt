package nullables

//not-null assertion operator, also known as double bang operator
fun main(){

    //try commenting and uncommenting both scenarios
    val a: String? = "hello"
//    val a: String? = null

//    val b = a?.length //putting ? sign will not crash the code even if the value is null, rather it will return the null value

    val b = a!!.length //however !! operator can crash the code so it should only be used when you are 100% sure that the value is not null and you just want to bypass kotlin compiler check for null safety

    var xyz = 9
    if (NullableSingleton().abc != null){
        xyz = NullableSingleton().abc!! //abc is nullable while xyz is not
    }
    println(b)
}

class NullableSingleton {
    var abc: Int? = null
    fun nullsAnObj(){
        abc = 99
    }
}