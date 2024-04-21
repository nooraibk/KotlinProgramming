package oop

fun main(){
    val obj1 = UserClass() //this step is called instantiation
    //val user: User = User() //you can also define the class of the object explicitly but just like normal variable types, you don't need it when you're assigning the value ot a variable on declaration time.


    println("Id of UserClass is ${obj1.id} & Title is ${obj1.title}")

    val obj2 = SecondUserClass(3, "Second User Class")
    println("Id of UserClass is ${obj2.id} & Title is ${obj2.title}") //hence arguments passed in constructor can be called as parameters using object reference.

    val obj3 = ThirdUserClass(4, "Third User Class")
    println("Id of UserClass is ${obj3.id} & Title is ${obj3.title}") //however here you cannot call arguments as parameters, as we are using them to initialize our variables/properties.

    val obj4 = FirstInitClass(42, "First Init Class" ,"Hello From First Init Class")
    obj4.firstInitBlockFunction()


    SecondInitClass() //by just calling the class with its primary constructor will run the init block
}

class UserClass{
    var id = 20
    var title = "User Class"
}

class SecondUserClass constructor(var id: Int, val title: String) //constructor keyword is optional and can be omitted unless you are using annotation of visible modifier


//Much like regular properties, properties declared in the primary constructor can be mutable (var) or read-only (val).
//primary constructor, along with superclass is referred as class header. all constructor,  superclass, and some other things are optional, however either one of them are present then it will be referred as class header.

//the above class can also be declared as

class ThirdUserClass(mId: Int, mTitle: String){
    var id = mId
    var title = mTitle
}

class FirstInitClass(id: Int, title: String = "First Init Class", body: String, secondaryBody: String = "Secondary Body"){

    //init block is automatically run when you create an object of the class.  Initialization code can be placed in initializer blocks, such as println() code
    //parameters must be declared by their type
    //initializing parameters in the middle of constructor is not recommended as it will get overwritten when creating object, however putting them in the end will retain their value just like with named parameters in functions.

    private var mId : Int
    private var mTitle : String
    private var mBody : String
    private var mSBody: String


    //
    init {
        mId = id
        mTitle = title
        mBody = body
        mSBody = secondaryBody
    }

    fun firstInitBlockFunction(){
        //println("Hello From First Init Class Init Block\n id= $id \n title = $title \n body = $body") //you cannot call parameters directly after they are assigned for initialization
        println("Hello From First Init Class Init Block\n id= $mId \n title = $mTitle \n body = $mBody \n secondary body = $mSBody")
    }

}

class SecondInitClass{
    init {
        println("Simple Second Init Class")
    }
}