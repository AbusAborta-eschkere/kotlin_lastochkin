fun printNumber(n: Int): List<Int> {
    if (n == 0) {
        return emptyList()
    }
    return (n downTo 1).toList()
}

fun main() {
    println("Введите число n:")
    val n = readLine()?.toIntOrNull() ?: 0

    val result = printNumber(n)
    println("printNumber($n) // $result")
}

