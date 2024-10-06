fun main() {
    println("Введите количество элементов массива:")
    val size = readLine()!!.toInt()
    val numbers = IntArray(size)
    println("Введите элементы массива (через пробел):")
    val input = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    for (i in 0 until size) {
        numbers[i] = input[i]
    }
    println("Введите элемент для проверки:")
    val element = readLine()!!.toInt()
    val isPresent = containsElement(numbers, element)
    println("Элемент $element присутствует: $isPresent")
}

fun containsElement(array: IntArray, element: Int): Boolean {
    for (num in array) {
        if (num == element) {
            return true
        }
    }
    return false
}
