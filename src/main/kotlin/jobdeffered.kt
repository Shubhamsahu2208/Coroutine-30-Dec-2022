import kotlinx.coroutines.*

fun main() = runBlocking{
    println("Main Start: ${Thread.currentThread().name}")

    val jobdeffered : Deferred<Int> =async {
        println("Fake work Start1: ${Thread.currentThread().name}")
        delay(100)
        println("Fake work Finish1: ${Thread.currentThread().name}")
        1500000
    }

    val num : Int = jobdeffered.await()
    println("Main Finish: ${Thread.currentThread().name}")
    //  job.cancel()
    }

