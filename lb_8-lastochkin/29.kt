fun main() {
    println("Введите количество элементов массива:")
    val size = readLine()!!.toInt()
    val numbers = IntArray(size)
    println("Введите элементы массива (через пробел):")
    val input = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    for (i in 0 until size) {
        numbers[i] = input[i]
    }
    val minMax = findMinMax(numbers)
    println("Минимальное: ${minMax.first}, Максимальное: ${minMax.second}")
}

fun findMinMax(array: IntArray): Pair<Int, Int> {
    var min = array[0]
    var max = array[0]
    for (i in 1 until array.size) {
        if (array[i] < min) {
            min = array[i]
        }
        if (array[i] > max) {
            max = array[i]
        }
    }
    return Pair(min, max)
}
