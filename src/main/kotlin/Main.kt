import kotlinx.coroutines.*
import kotlin.system.*


fun main() {
    runBlocking {
        println("Weather Forecast")
        println(getWeatherReport())
        println("Have a good day!")
    }
}

suspend fun getTemp(): String {
    delay(1000)
    return "30℃"
}

suspend fun getForecast(): String {
    delay(1000)
    return "Sunny"
}

suspend fun getWeatherReport() = coroutineScope {
    val forecast = async { getForecast() }

    val temperature = async { getTemp() }

    "${forecast.await()} ${temperature.await()}"
}

