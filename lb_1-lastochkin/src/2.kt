fun main() {
    print("Введите число: ")
    val input = readLine()

    if (input != null) {
        try {
            val number = input.toDouble()
            val formattedNumber = String.format("%.2f", number)
            println("Число с точностью до сотых: $formattedNumber")
        } catch (e: NumberFormatException) {
            println("Некорректный ввод. Введите число.")
        }
    } else {
        println("Ввод не получен.")
    }
}
