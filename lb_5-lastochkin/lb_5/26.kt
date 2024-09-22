fun main() {
    print("Введите число N: ")
    val n = readLine()!!.toInt()

    val (evenSum, oddSum) = sumEvenOdd(n)

    println("Сумма четных чисел от 1 до $n: $evenSum")
    println("Сумма нечетных чисел от 1 до $n: $oddSum")
}

fun sumEvenOdd(n: Int): Pair<Int, Int> {
    var evenSum = 0
    var oddSum = 0

    for (i in 1..n) {
        if (i % 2 == 0) {
            evenSum += i
        } else {
            oddSum += i
        }
    }

    return Pair(evenSum, oddSum)
}
