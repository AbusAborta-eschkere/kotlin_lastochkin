fun main() {
    print("Введите число N: ")
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        // Вывод пробелов для создания отступов
        for (j in 1..(n - i)) {
            print("  ")
        }

        // Вывод чисел в строке
        for (j in 1..i) {
            print("$j ")
        }

        // Вывод чисел в обратном порядке
        for (j in (i - 1) downTo 1) {
            print("$j ")
        }

        // Переход на новую строку
        println()
    }
}
