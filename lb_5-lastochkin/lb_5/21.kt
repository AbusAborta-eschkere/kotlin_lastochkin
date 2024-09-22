fun main() {
    print("Введите год: ")
    val year = readLine()!!.toInt()

    print("Введите месяц: ")
    val month = readLine()!!.toInt()

    // Проверка корректности ввода месяца
    if (month !in 1..12) {
        println("Некорректный месяц.")
        return
    }

    // Получение последнего дня месяца
    val lastDay = when (month) {
        2 -> if (isLeapYear(year)) 29 else 28
        4, 6, 9, 11 -> 30
        else -> 31
    }

    // Вывод всех дат в заданном месяце
    for (day in 1..lastDay) {
        println(String.format("%02d.%02d.%04d", day, month, year))
    }
}

// Функция для проверки високосного года
fun isLeapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
}
