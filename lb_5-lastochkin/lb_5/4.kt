fun main() {
    println("Введите число:")
    val n = readLine()!!.toInt()

    var factorial = 1L // Используем Long для больших значений факториала
    for (i in 1..n) {
        factorial *= i.toLong()
    }

    println("Факториал $n равен: $factorial")
}
