package datastructures

import java.util.*

fun main(){
    // Example usage
    val newData1 = "New data 1"
// ... user performs other actions ...
    updateData(newData1)
    val newData2 = "New data 2"
// ... user performs other actions ...
    updateData(newData2)
    for (item in backupStack){
        println(item)
    }
    undo()// restores newData1
    for (item in backupStack){
        println(item)
    }
    undo() // restores previous data
    for (item in backupStack){
        println(item)
    }
}

// Define a stack to keep track of changes
val backupStack: Stack<String> = Stack()

// Function to update the data and create a backup
fun updateData(newData: String) {
    // Push the current data onto the stack
    backupStack.push(newData)
    // Update the actual data
    // ...
}

// Function to undo the previous update
fun undo() {
    if (!backupStack.empty()) {
        // Pop the top state from the stack and restore it
        val backupData = backupStack.pop()
        // Update the actual data with the restored backup
        // ...
    }
}

