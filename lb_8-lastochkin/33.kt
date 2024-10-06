fun main() {
    println("Введите количество элементов массива:")
    val size = readLine()!!.toInt()
    val numbers = IntArray(size)
    println("Введите элементы массива (через пробел):")
    val input = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    for (i in 0 until size) {
        numbers[i] = input[i]
    }
    println("Введите индекс элемента:")
    val index = readLine()!!.toInt()
    val element = findElementByIndex(numbers, index)
    println("Элемент по индексу $index: $element")
}

fun findElementByIndex(array: IntArray, index: Int): Int? {
    if (index in 0 until array.size) {
        return array[index]
    } else {
        return null
    }
}
