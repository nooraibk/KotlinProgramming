package generics

fun main(){

}

sealed class Result<out T> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Failure(val message: String) : Result<Nothing>()
}

class StringResult(private val result: Result<String>) {
    fun getString(): String? {
        return when (val data = result) {
            is Result.Success -> data.data
            is Result.Failure -> null
        }
    }
}

class IntResult(private val result: Result<Int>) {
    fun getInt(): Int? {
        return when (val data = result) {
            is Result.Success -> data.data
            is Result.Failure -> null
        }
    }
}
