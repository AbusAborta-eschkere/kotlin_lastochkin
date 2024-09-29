fun main() {
    // Создание массива чисел
    val numbers = intArrayOf(5, 12, 3, 8, 1, 9, 2, 10, 7, 4)

    // Сортировка массива методом пузырька
    bubbleSort(numbers)

    // Вывод отсортированного массива
    println("Отсортированный массив:")
    for (number in numbers) {
        print("$number ")
    }
}

// Функция для сортировки массива методом пузырька
fun bubbleSort(numbers: IntArray) {
    val n = numbers.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (numbers[j] > numbers[j + 1]) {
                // Обмен элементов
                val temp = numbers[j]
                numbers[j] = numbers[j + 1]
                numbers[j + 1] = temp
            }
        }
    }
}
