fun fD(numbers: List<Int>): Int {
    if (numbers.isEmpty()) {
        return 0
    }
    val maxValue = numbers.maxOrNull() ?: 0
    val minValue = numbers.minOrNull() ?: 0
    return maxValue - minValue
}

fun main() {
    val numbers = listOf(5, 2, 8, 1, 9, 3)
    val difference = fD(numbers)
    println("Список: $numbers")
    println("Разность между максимальным и минимальным значениями: $difference")
}

