fun main() {
    val numbers = intArrayOf(1, 4, 7, 2, 9, 6, 3, 8, 5, 10)

    var sum = 0
    for (number in numbers) {
        if (number % 2 == 0) {
            sum += number
        }
    }

    println("Сумма четных чисел: $sum")
}
