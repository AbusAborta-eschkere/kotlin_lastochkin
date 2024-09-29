fun main() {
    // Создание массива чисел
    val numbers = intArrayOf(1, 4, 7, 2, 9, 6, 3, 8, 5, 10)

    // Создание массивов для четных и нечетных чисел
    val evenNumbers = mutableListOf<Int>()
    val oddNumbers = mutableListOf<Int>()

    // Разделение чисел на четные и нечетные
    for (number in numbers) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
        } else {
            oddNumbers.add(number)
        }
    }

    // Вывод четных чисел
    println("Четные числа:")
    for (number in evenNumbers) {
        print("$number ")
    }
    println()

    // Вывод нечетных чисел
    println("Нечетные числа:")
    for (number in oddNumbers) {
        print("$number ")
    }
    println()
}
