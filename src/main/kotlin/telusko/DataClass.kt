fun main(){
    var obj1 = ParentOne("Hello", 20)
    var obj2 = ParentOne("Hello", 20)

    var obj3 = obj1.copy(argTwo = 30)

    println(obj1.equals(obj2))
    println(obj3)

}


//1. every class needs a .toString() function
//2. need to override .equals() && hashCode() functions
//3. copy() function

data class ParentOne(var argOne :String, val argTwo :Int){

    fun show(){
        println("show from ParentOne")
    }

}

