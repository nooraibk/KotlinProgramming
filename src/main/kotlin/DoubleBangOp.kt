fun main(){

    //try commenting and uncommenting both scenarios
    val a: String? = "hello"
//    val a: String? = null

//    val b = a?.length //putting ? sign will not crash the code even if the value is null, rather it will return the null value

    val b = a!!.length //however !! operator can crash the code so it should only be used when you are 100% sure that the value is not null and you just want to bypass kotlin compiler check for null safety
    println(b)
}