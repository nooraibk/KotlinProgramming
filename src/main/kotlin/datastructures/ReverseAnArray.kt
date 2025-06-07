package datastructures

fun main() {
    println("newArrayAfter ${reverseIntArray(arrayOf(123, 234, 345, 456, 567, 678))./*contentToString*/joinToString(" ")}")
}

fun reverseIntArray(arr: Array<Int>): Array<Int> {
    var left = 0
    var right = arr.size -1
    val newArr = arr
    while (left < right) {
        val temp = arr[left]
        newArr[left] = arr[right]
        newArr[right] = temp
        left++
        right--
    }
    return newArr
}
