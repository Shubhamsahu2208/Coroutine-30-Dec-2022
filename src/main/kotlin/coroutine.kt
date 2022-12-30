import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    println("Main Start: ${Thread.currentThread().name}")

    val job: Job =launch {
        println("Fake work Start1: ${Thread.currentThread().name}")
        delay(100)
        println("Fake work Finish1: ${Thread.currentThread().name}")
    }

  //  job.cancel()
    job.join()
    println("Main End: ${Thread.currentThread().name}")

    runBlocking {
        delay(3000)

        println("Fake work Start1: ${Thread.currentThread().name}")
        delay(100)
        println("Fake work Finish1: ${Thread.currentThread().name}")

    }

}