import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

fun getDayOfWeek(dayNumber: Int): String {
    return when (dayNumber) {
        1 -> "Понедельник"
        2 -> "Вторник"
        3 -> "Среда"
        4 -> "Четверг"
        5 -> "Пятница"
        6 -> "Суббота"
        7 -> "Воскресенье"
        else -> "Некорректный номер дня"
    }
}

fun main() {
    print("Введите номер дня недели (1-7): ")
    val dayNumber = readLine()?.toIntOrNull()

    if (dayNumber != null) {
        println(getDayOfWeek(dayNumber))
    } else {
        println("Некорректный ввод")
    }
}
