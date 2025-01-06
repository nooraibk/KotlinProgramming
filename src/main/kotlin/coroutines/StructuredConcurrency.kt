package coroutines

import kotlinx.coroutines.*

/**
 * Kotlin encourages structured concurrency, which means that coroutines are tied to a specific scope. When the scope is canceled, all coroutines within that scope are also canceled.
 *
 * Kotlin promotes structured concurrency, which organizes coroutines in a way that ensures proper lifecycle management. This approach helps prevent issues like memory leaks and unhandled exceptions by ensuring that coroutines are canceled when their parent scope is terminated.
 */

fun main() = runBlocking {
    val job = launch {
        repeat(1000) { i ->
            println("Job: I'm working on $i ...")
            delay(500L)
        }
    }
    delay(1300L) // Delay for a while
    println("Main: I'm tired of waiting!")
    job.cancel() // Cancel the job
    job.join() // Wait for the job to complete
    println("Main: Now I can quit.")
}
