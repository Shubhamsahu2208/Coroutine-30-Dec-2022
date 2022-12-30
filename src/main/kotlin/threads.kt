import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis
import kotlin.concurrent.thread

fun main(){
    create10kCoroutine()
    create10kThread()

}

fun create10kCoroutine()= runBlocking{
    var a=1
    var b=101
    val duration= measureTimeMillis {
        repeat(100){
            GlobalScope.launch{
                println("Start B"+ b++)
                delay(100)
                println("Coroutine :"+ a++)
            }
        }

    }
    println("Coroutine Time=${(duration)} miliseconds")
}

fun create10kThread(){
    var a=1
    val duration= measureTimeMillis {
       thread{
           repeat(100){
               Thread.sleep(100)
               println("Theads :"+ a++)

           }
       }

    }
    println("Thread Time=${(duration)} milisecond")

}

fun create10kThreadA(){
    var a=1
    val duration= measureTimeMillis {
        thread{
            repeat(100){
                Thread.sleep(100)
                println("Theads :"+ a++)

            }
        }

    }
    println("Thread Time=${(duration)} milisecond")

}


