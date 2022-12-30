import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking{
    println("Main Start: ${Thread.currentThread().name}")

    val time = measureTimeMillis {
        val msgOne = getMessageOne()
        val msgTwo = getMessageTwo()
        println("Entire Massage is : ${msgOne +" "+ msgTwo}")
    }
    println("Complete in $time ms")
    println("Main End: ${Thread.currentThread().name}")
}
suspend fun getMessageOne():String {
    delay(1000)
    return "Hello"
}
 suspend fun getMessageTwo():String {
    delay(1000)
    return "Welcome"
}