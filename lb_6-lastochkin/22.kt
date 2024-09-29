fun main() {
    val numbers = intArrayOf(1, 5, 3, 8, 2, 7, 4, 9, 6, 10)

    val secondMax = findSecondMax(numbers)

    println("Второй по величине элемент: $secondMax")
}

fun findSecondMax(array: IntArray): Int {
    if (array.size < 2) {
        return -1 // Возвращаем -1, если в массиве меньше 2 элементов
    }

    // Сортируем массив по убыванию
    array.sortDescending()

    // Второй элемент в отсортированном массиве - это второй максимальный
    return array[1]
}
