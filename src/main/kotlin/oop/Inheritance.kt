package oop

fun main(){
    //InheritsAndImplements() // just initializing class doesn't mean its overrided functions will be triggered too
    val obj = InheritsAndImplements()
    obj.nothingFun()
}

//class CClass: AClass(), BClass() //in kotlin you can only have one super class, however you can inherit more than one interface.

open class AClass

open class BClass

/////////////////////////////////

interface InheritsNothing /*: BClass*/{ // interface cannot inherit from a class
    fun nothingFun()
}

interface InterfaceX

// it is optional for InheritsACLass to implement InheritsNothing's nothingFun() function as it is an interface. however if it does implement InheritsNothing's nothingFun() function then class/function inheritting InheritsACLass have the option to implement InheritsNothing's nothingFun() as InheritsACLass provided a default implementation InheritsACLass
interface InheritsACLass : /*AClass,*/ InheritsNothing{
    override fun nothingFun() {
        println("this is the default implementation of nothingFun() and the class/interface that will inherit InheritsACLass have the option to override or leave it to its default implementation")
    }
}

class JustInheritsAClass : InheritsACLass //have the option to inherit nothingFun() or not

class InheritsAndImplements : InheritsACLass, InheritsNothing{
    override fun nothingFun() {
        super.nothingFun()
        println("InheritsAndImplements class implementation")
    }
}