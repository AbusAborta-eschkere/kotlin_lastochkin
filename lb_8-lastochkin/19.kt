fun main() {
    println("Введите количество элементов массива:")
    val size = readLine()!!.toInt()
    val numbers = IntArray(size)
    println("Введите элементы массива (через пробел):")
    val input = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    for (i in 0 until size) {
        numbers[i] = input[i]
    }
    val sum = sumOfArray(numbers)
    println("Сумма: $sum")
}

fun sumOfArray(array: IntArray): Int {
    var sum = 0
    for (num in array) {
        sum += num
    }
    return sum
}
