import kotlinx.coroutines.*


fun main() = runBlocking{
    println("Main Start: ${Thread.currentThread().name}")
    var i = 1
    val job: Job =launch {

        repeat(500){
            print("$i.")
            i++
           delay(1)
            yield()
        }
    }
    delay(20)
    job.cancelAndJoin()

    println("Main End: ${Thread.currentThread().name}")


}