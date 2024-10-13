fun generatePyramid(n: Int) {
    if (n <= 0) return // Выход, если n <= 0

    for (i in 1..n) {
        println(" ".repeat(n - i) + "#".repeat(2 * i - 1) + " ".repeat(n - i))
    }
}

fun main() {
    println("Введите количество уровней пирамиды:")
    val n = readLine()?.toIntOrNull() ?: 0
    println("pyramid($n)")
    generatePyramid(n)
}

