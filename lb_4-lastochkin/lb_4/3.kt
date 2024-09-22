import java.time.LocalTime

fun getTimeOfDay(time: LocalTime): String {
    return when {
        time.hour in 6..11 -> "Утро"
        time.hour in 12..17 -> "День"
        time.hour in 18..22 -> "Вечер"
        else -> "Ночь"
    }
}

fun main() {
    print("Введите время в формате HH:mm: ")
    val inputTime = readLine()!!

    val time = LocalTime.parse(inputTime)
    val timeOfDay = getTimeOfDay(time)
    println("Время суток: $timeOfDay")
}
