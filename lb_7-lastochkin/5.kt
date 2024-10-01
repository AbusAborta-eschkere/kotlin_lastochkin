fun areNumbersEqual(num1: Int, num2: Int): Boolean {
    return num1 == num2
}

fun main() {
    println("Введите первое число:")
    val num1 = readLine()?.toIntOrNull() ?: 0 // Считываем первое число и преобразуем в Int
    println("Введите второе число:")
    val num2 = readLine()?.toIntOrNull() ?: 0 // Считываем второе число и преобразуем в Int

    if (num1 != null && num2 != null) { // Проверяем, что оба числа были введены корректно
        val isEqual = areNumbersEqual(num1, num2)
        println("$isEqual")
    } else {
        println("Некорректный ввод.")
    }
}
