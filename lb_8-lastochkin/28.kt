fun main() {
    println("Введите число N:")
    val n = readLine()!!.toInt()
    val newArray = createArray(n)
    println("Массив от 1 до $n: ${newArray.contentToString()}")
}

fun createArray(n: Int): IntArray {
    val array = IntArray(n)
    for (i in 0 until n) {
        array[i] = i + 1
    }
    return array
}
