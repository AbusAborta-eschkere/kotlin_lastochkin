fun main() {
    println("Введите число N:")
    val n = readLine()!!.toInt()
    val sum = sumOfFirstNNumbers(n)
    println("Сумма первых $n натуральных чисел: $sum")
}

fun sumOfFirstNNumbers(n: Int): Int {
    return (n * (n + 1)) / 2
}
