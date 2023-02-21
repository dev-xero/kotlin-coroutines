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
    try {
        delay(1000)
        throw AssertionError("Temperature is invalid")
        return "30℃"
    } catch(e: AssertionError) {
        println("Error: $e")
        return "Oops! Couldn't get the temperature!"
    }
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

