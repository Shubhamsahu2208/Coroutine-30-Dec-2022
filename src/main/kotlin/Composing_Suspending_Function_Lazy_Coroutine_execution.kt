import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking {

    println("Main Start: ${Thread.currentThread().name}")



    val msgOne: Deferred<String> = async(start = CoroutineStart.LAZY) {
        //Code are Write Here.......
        getMessageOneee()
    }
    val msgTwo: Deferred<String> = async(start = CoroutineStart.LAZY) {
        //Code are Write Here.......
        getMessageTwooo()
    }
    println("Entire Massage is : ${msgOne.await() + "  " + msgTwo.await()}")


    println("Main End: ${Thread.currentThread().name}")
}


suspend fun getMessageOneee():String {
    println("After getting getMessageOne")
    delay(1000L)
    return "Hello"
}
suspend fun getMessageTwooo():String {
    println("After getting getMessageTwo")
    delay(1000L)
    return "Welcome"
}