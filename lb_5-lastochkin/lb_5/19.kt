fun main() {
    println("Введите количество элементов в массиве:")
    val size = readLine()!!.toInt()

    println("Введите элементы массива (через пробел):")
    val input = readLine()!!.split(" ")
    val numbers = IntArray(size) { input[it].toInt() }

    // Сортировка пузырьком
    for (i in 0 until numbers.size - 1) {
        for (j in 0 until numbers.size - i - 1) {
            if (numbers[j] > numbers[j + 1]) {
                val temp = numbers[j]
                numbers[j] = numbers[j + 1]
                numbers[j + 1] = temp
            }
        }
    }

    println("Отсортированный массив:")
    for (number in numbers) {
        print("$number ")
    }
}
