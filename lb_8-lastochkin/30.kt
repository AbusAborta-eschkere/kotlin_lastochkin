fun main() {
    println("Введите число N:")
    val n = readLine()!!.toInt()
    val sum = sumOfNumbers(n)
    println("Сумма чисел от 1 до $n: $sum")
}

fun sumOfNumbers(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    return sum
}
