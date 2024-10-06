fun main() {
    println("Введите температуру в Цельсиях:")
    val celsius = readLine()!!.toDouble()
    val fahrenheit = celsiusToFahrenheit(celsius)
    println("$celsius градусов Цельсия = $fahrenheit градусов Фаренгейта")
}

fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 9 / 5 + 32
}
