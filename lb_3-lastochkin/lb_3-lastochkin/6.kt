fun main() {
    println("Введите год:")
    val year = readLine()!!.toInt()

    val isLeapYear = isLeapYear(year)

    val daysInYear = if (isLeapYear) 366 else 365

    println("Год $year ${if (isLeapYear) "високосный" else "не високосный"}")
    println("Количество дней в году: $daysInYear")
}

fun isLeapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0
}
