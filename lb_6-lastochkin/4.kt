fun main() {
    // Создание массива чисел
    val numbers = intArrayOf(5, 12, 3, 8, 1, 9, 2, 10, 7, 4)

    // Сортировка массива
    numbers.sort()

    // Вывод отсортированного массива
    println("Отсортированный массив:")
    for (number in numbers) {
        print("$number ")
    }
}
