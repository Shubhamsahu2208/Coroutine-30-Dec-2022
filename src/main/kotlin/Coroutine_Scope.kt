import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("runBloking : $this")

    launch {
        println("Launch 1: $this")

        launch {
            println("Launch 1a: $this")
        }
    }

    launch {
        println("Launch 2: $this")
    }

    async {
        println("Async 1: $this")

        async {
            println("Async 1a: $this")
        }
    }

    async {
        println("Async 2: $this")
    }

    async {
        println("Async 3: $this")
    }

    println("End of Coroutine Scope")
}