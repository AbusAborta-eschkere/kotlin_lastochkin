fun main() {
    print("Введите строку: ")
    val inputString = readLine()

    if (inputString != null) {
        val length = inputString.length

        when (length) {
            0 -> println("Строка пустая")
            1 -> println("В строке один символ")
            in 2..10 -> println("В строке от 2 до 10 символов")
            else -> println("В строке больше 10 символов")
        }
    } else {
        println("Ввод не получен.")
    }
}
