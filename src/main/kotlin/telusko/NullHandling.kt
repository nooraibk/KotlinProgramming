fun main(){
    var obj = Alien()

    var obj1: Alien? = null
//    println(obj.name)
//    println(obj1?.name)

    var num = 5 downTo 1
    for (i in num)
        println(i)
}

class Alien{
    var name: String? = null
}