import kotlinx.coroutines.*
import kotlin.system.*

fun main() {
    val time = measureTimeMillis {
        runBlocking {
            println("Weather Forcast")
            launch {
                printForcast()
            }

            launch {
                printForcast()
            }
        }
    }

    println("Execution time(seconds): ${time / 1000.0}s")
}

suspend fun printForcast() {
    delay(1000)
    println("Sunny")
}

suspend fun printTemp() {
    delay(1000)
    println("30℃")
}