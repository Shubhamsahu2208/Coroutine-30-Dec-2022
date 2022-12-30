import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking{
    println("Main Start: ${Thread.currentThread().name}")

    val time = measureTimeMillis {
        val msgOne: Deferred<String> = async {
            //Code are Write Here.......
            getMessageOnee()
        }
        val msgTwo: Deferred<String> = async {
        //Code are Write Here.......
            getMessageTwoo()
        }
        println("Entire Massage is : ${msgOne.await() +"  "+ msgTwo.await()}")
    }
    println("Complete in $time ms")
    println("Main End: ${Thread.currentThread().name}")
}

suspend fun getMessageOnee():String {
    delay(1000L)
    return "Hello"
}
suspend fun getMessageTwoo():String {
    delay(1000L)
    return "Welcome"
}