fun main(){

    val obj1 = ABC(4)
    println(obj1.getABC())

    val genObj1 = IJK<Int>(5) //the angle bracket type can be removed as the object is getting initialized rather than just declaration
    println(genObj1.getIJK())

    val genObj2 = PQR("Class PQR")
    println(genObj2.getIJK())

    val obj3 = mutableListOf<Int>(2, 4, 5) //a common example where we use generics in Lists. But we usually omit explicit type declaration in angle brackets
    for (i in obj3){
        println(i)
    }
}


//lets take a model conventional model class with getters and setters


class ABC (var param1: Int){

    fun setABC(i: Int){
        param1 = i
    }

    fun getABC() = param1
}


//now lets assume we have to make a similar class but of type String.
//**set function is just for fashion but the whole class is just for fashion and can be replaced with simple data class

class XYZ (var param1: Int){

    fun setXYZ(i: Int){
        param1 = i
    }

    fun getXYZ() = param1
}


/**it is tedious and will become even more when we have to create several classes of similar structure but with different type
 * to solve this we have generics.
 * You can put angle bracket before constructor to mark a class as generic and pass any data type while initializing the object of that class
 */

//Here T is a generic reference, which will take any data type, predefined or custom. You can replace T wil any other letter

class IJK<T>(var param1: T){
    fun setIJK(i: T){
        param1 = i
    }

    fun getIJK(): T = param1
}

//another exact same class but with different generic reference, you can also use any other letter instead of T or K

class PQR<K>(var param1: K){
    fun setIJK(i: K){
        param1 = i
    }

    fun getIJK(): K = param1
}