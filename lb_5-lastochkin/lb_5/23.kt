fun main() {
    while (true) {
        print("Введите первое число: ")
        val num1Str = readLine()!!
        if (num1Str == "стоп") break

        print("Введите второе число: ")
        val num2Str = readLine()!!
        if (num2Str == "стоп") break

        try {
            val num1 = num1Str.toFloat()
            val num2 = num2Str.toFloat()

            print("Выберите операцию (+ или *): ")
            val operation = readLine()!!

            when (operation) {
                "+" -> println("$num1 + $num2 = ${num1 + num2}")
                "*" -> println("$num1 * $num2 = ${num1 * num2}")
                else -> println("Некорректная операция. Доступны + и *.")
            }
        } catch (e: NumberFormatException) {
            println("Некорректный ввод. Пожалуйста, введите числа.")
        }
    }
}
