import kotlinx.coroutines.*


fun main() = runBlocking {
    println("Main Start: ${Thread.currentThread().name}")
    var i = 1
    val job: Job = launch(Dispatchers.Default) {
        try {
            repeat(500) {
                if (!isActive) {
                    return@launch
                }
                print("$i.")
                i++
                delay(20)
                // yield()
            }
        } catch (ex: CancellationException) {
            println()
            println("Exception caught  safety")
        }finally {
            delay(1000)
            println("Close Resource in finally")
        }
    }
    delay(2000)
    job.cancelAndJoin()
    println("Main End: ${Thread.currentThread().name}")
}