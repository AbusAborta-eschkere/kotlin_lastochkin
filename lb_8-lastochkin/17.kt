fun main() {
    println("Введите число:")
    val num = readLine()!!.toInt()
    var factorial = 1
    for (i in 1..num) {
        factorial *= i
    }
    println("Факториал: $factorial")
}

