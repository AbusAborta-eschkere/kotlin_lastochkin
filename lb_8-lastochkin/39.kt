fun main() {
    println("Введите количество элементов массива:")
    val size = readLine()!!.toInt()
    val numbers = IntArray(size)
    println("Введите элементы массива (через пробел):")
    val input = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    for (i in 0 until size) {
        numbers[i] = input[i]
    }
    val reversedArray = reverseArray(numbers)
    println("Перевернутый массив: ${reversedArray.contentToString()}")
}

fun reverseArray(array: IntArray): IntArray {
    val reversedArray = array.clone()
    for (i in 0 until array.size / 2) {
        val temp = reversedArray[i]
        reversedArray[i] = reversedArray[array.size - i - 1]
        reversedArray[array.size - i - 1] = temp
    }
    return reversedArray
}
