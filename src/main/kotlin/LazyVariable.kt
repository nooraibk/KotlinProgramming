fun main(){
    /**
     * lazy variable is the one that does not get memory allocation at the time of variable initialization. rather it waits for a call.
     * and when it is called, then memory is allocated. This saves unnecessary memory allocation to variables that are never called but get reference initialization.
     *
     * Once the lazy variable is called then it gets memory allocation and when the next time they will be called, the memory will be already allocated, the variable will be loaded from cache memory.
     *
     * lazy variable can be initialized to any val or var or any mutable or immutable data type.
      */

//    var i: Int by lazy {
//        299
//    }

    val list: MutableList<Int> by lazy {
        mutableListOf()
    }

}

