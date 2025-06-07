package datastructures

fun main() {
    val arr = arrayOf(1, 2, 3, 8, 8)
    println("${findLargest(arr)}")
}

fun findSecondLargest(arr : Array<Int>) : Int {
    if (arr.size < 2) return -1

    var firstLargest = arr[0]
    var secondLargest = arr[1]
    for (num in arr) {
        if (num > firstLargest) {
            secondLargest = firstLargest
            firstLargest = num
        } else if ((num != firstLargest) and (num > secondLargest)) {
            secondLargest = num
        }
    }

    return if (secondLargest == -1) {
        -1
    } else {
        secondLargest
    }
}

fun findLargest( arr : Array<Int>) : Int {
    if (arr.size == 0) return -1
    var largestNumber = arr[0]
    for (num in arr) {
        if (num > largestNumber) {
            largestNumber = num
        }
    }
    return largestNumber
}