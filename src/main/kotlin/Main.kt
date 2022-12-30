import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() {

    runBlocking {

        delay(1000)
        println("Main Program start: ${Thread.currentThread().name}")

        GlobalScope.async (Dispatchers.Default) {
            println("Fake work Start1: ${Thread.currentThread().name}")
            delay(100)
            println("Fake work Finish1: ${Thread.currentThread().name}")


        }
        runBlocking {
            delay(3000)
        }
        GlobalScope.launch(Dispatchers.Default) {
            println("Fake work Start2: ${Thread.currentThread().name}")
            delay(1)
            println("Fake work Finish2: ${Thread.currentThread().name}")
        }
        GlobalScope.launch(Dispatchers.Default) {
            println("Fake work Start3: ${Thread.currentThread().name}")
            delay(1)
            println("Fake work Finish3: ${Thread.currentThread().name}")
        }

        GlobalScope.launch(Dispatchers.Default) {
            println("Fake work Start4: ${Thread.currentThread().name}")
            delay(100)
            println("Fake work Finish4: ${Thread.currentThread().name}")
        }
        GlobalScope.launch(Dispatchers.Default) {
            println("Fake work Start5: ${Thread.currentThread().name}")
            delay(1)
            println("Fake work Finish5: ${Thread.currentThread().name}")
        }


        Thread.sleep(1000)
        println("Main Program End: ${Thread.currentThread().name}")
    }

}

