fun main() {
    print("Введите число: ")
    val input = readLine()

    if (input != null) {
        val number = input.toInt()
        println("Вы ввели число: $number")
    } else {
        println("Ввод не получен.")
    }
}
