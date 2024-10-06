fun main() {
    println("Введите количество элементов массива:")
    val size = readLine()!!.toInt()
    val numbers = IntArray(size)
    println("Введите элементы массива (через пробел):")
    val input = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    for (i in 0 until size) {
        numbers[i] = input[i]
    }
    val lastElement = lastElement(numbers)
    println("Последний элемент: $lastElement")
}

fun lastElement(array: IntArray): Int {
    return array[array.size - 1]
}
