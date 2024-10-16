package oop


fun main(){
    val obj = C()
}

interface J {
    fun xyz()
}

interface K {
    fun xyz()
}

class D: K {
    override fun xyz() {
        println("aa")
    }
}

class G: J {
    override fun xyz() {
        println("bb")
    }
}

class C: J, K {
    override fun xyz() {

    }
}

