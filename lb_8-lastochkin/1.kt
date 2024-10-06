fun main() {
    println("Введите числа через пробел:")
    val input = readLine() ?: ""
    val numbers = input.split(" ").map { it.toInt() }

    var sum = 0
    for (number in numbers) {
        sum += number
    }

    println("Сумма элементов списка: $sum")
}
