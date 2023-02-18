import kotlinx.coroutines.*

fun main() {
    runBlocking {
        println("Weather Forcast")
        printForcast()
    }
}

fun printForcast() {
    delay(1000)
    println("Sunny")
}