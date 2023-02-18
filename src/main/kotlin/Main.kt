import kotlinx.coroutines.*

fun main() {
    runBlocking {
        println("Weather Forcast")
        printForcast()
    }
}

suspend fun printForcast() {
    delay(1000)
    println("Sunny")
}