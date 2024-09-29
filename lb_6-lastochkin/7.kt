fun main() {
    // Создание массива чисел
    val numbers = intArrayOf(8, 1, 5, 2, 6)

    // Реверс массива
    numbers.reverse()

    // Вывод реверсированного массива
    println("Реверсированный массив:")
    for (number in numbers) {
        print("$number ")
    }
}
