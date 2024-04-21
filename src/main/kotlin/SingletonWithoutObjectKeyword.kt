
//Singleton pattern restricts multiple object initialization of a class.

class Manager private constructor(){ //making the constructor private disables the initialization of the class however we can create a static/companion to create method to get the instance of the class.
    companion object{
        private var instance: Manager? = null
//        fun getInstance() = synchronized(this){ //synchronized() function will force only one reference despite being called from multiple threads.
        operator fun invoke() = synchronized(this){
            if (instance == null)
                instance = Manager()
            instance

        }
    }
}

fun main() {
    //even we are calling instance multiple times, the reference address will be same, hence telling that there is only one instance possible.
//    println(Manager.getInstance())
//    println(Manager.getInstance())
    println(Manager())
    println(Manager())
}