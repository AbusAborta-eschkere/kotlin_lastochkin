fun findMinNumber(numbers: List<Int>): Int? {
    if (numbers.isEmpty()) {
        return null // Возврат null, если список пустой
    }
    var minNumber = numbers[0]
    for (number in numbers) {
        if (number < minNumber) {
            minNumber = number
        }
    }
    return minNumber
}

fun main() {
    println("Введите числа через пробел:")
    val input = readLine() // Считывание строки с вводом
    val numbers = input?.split(" ")?.map { it.toInt() } // Преобразование строки в список целых чисел
    if (numbers != null) { // Проверка, что список не пустой
        val minNumber = findMinNumber(numbers)
        println("Самое маленькое число: $minNumber")
    } else {
        println("Некорректный ввод.")
    }
}
