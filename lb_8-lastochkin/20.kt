fun main() {
    println("Введите количество элементов массива:")
    val size = readLine()!!.toInt()
    val numbers = IntArray(size)
    println("Введите элементы массива (через пробел):")
    val input = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    for (i in 0 until size) {
        numbers[i] = input[i]
    }
    val max = findMax(numbers)
    println("Максимальное число: $max")
}

fun findMax(array: IntArray): Int {
    var max = array[0]
    for (i in 1 until array.size) {
        if (array[i] > max) {
            max = array[i]
        }
    }
    return max
}
