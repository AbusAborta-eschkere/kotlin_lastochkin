fun main() {
    // Создание массива чисел
    val numbers = intArrayOf(1, 4, 7, 2, 9, 6, 3, 8, 5, 10)

    // Запрос элемента для поиска
    println("Введите элемент для поиска:")
    val searchElement = readLine()!!.toInt()

    // Поиск элемента в массиве
    var index = -1
    for (i in numbers.indices) {
        if (numbers[i] == searchElement) {
            index = i
            break
        }
    }

    // Вывод результата
    if (index != -1) {
        println("Элемент $searchElement найден по индексу $index.")
    } else {
        println("Элемент $searchElement не найден в массиве.")
    }
}
