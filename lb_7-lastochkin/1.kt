import kotlin.math.pow

fun main() {
    println("Добро пожаловать в консольный калькулятор!")

    while (true) {
        println("Выберите операцию:")
        println("1. Сложение")
        println("2. Вычитание")
        println("3. Умножение")
        println("4. Деление")
        println("5. Возведение в степень")
        println("6. Выход")

        val choice = readLine()!!.toIntOrNull()

        if (choice == null || choice !in 1..6) {
            println("Неверный выбор. Пожалуйста, введите число от 1 до 6.")
            continue
        }

        if (choice == 6) {
            println("До свидания!")
            break
        }

        println("Введите первое число:")
        val num1 = readLine()!!.toDoubleOrNull()

        if (num1 == null) {
            println("Неверное первое число. Пожалуйста, введите число.")
            continue
        }

        println("Введите второе число:")
        val num2 = readLine()!!.toDoubleOrNull()

        if (num2 == null) {
            println("Неверное второе число. Пожалуйста, введите число.")
            continue
        }

        val result = when (choice) {
            1 -> num1 + num2
            2 -> num1 - num2
            3 -> num1 * num2
            4 -> if (num2 == 0.0) {
                println("Деление на ноль невозможно!")
                continue
            } else {
                num1 / num2
            }
            5 -> num1.pow(num2)
            else -> 0.0
        }

        println("Результат: $result")
    }
}
