fun main() {
    println("Введите количество элементов массива:")
    val size = readLine()!!.toInt()
    val numbers = IntArray(size)
    println("Введите элементы массива (через пробел):")
    val input = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    for (i in 0 until size) {
        numbers[i] = input[i]
    }
    println("Введите элемент для поиска:")
    val element = readLine()!!.toInt()
    val index = findFirstOccurrence(numbers, element)
    println("Индекс первого вхождения: $index")
}

fun findFirstOccurrence(array: IntArray, element: Int): Int {
    for (i in 0 until array.size) {
        if (array[i] == element) {
            return i
        }
    }
    return -1
}
