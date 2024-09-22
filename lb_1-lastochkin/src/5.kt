fun main() {
    print("Введите число: ")
    val input = readLine()

    if (input != null) {
        val number = input.toInt()
        println("вот какое число Вы ввели: $number")
    } else {
        println("Ввод не получен.")
    }
}
