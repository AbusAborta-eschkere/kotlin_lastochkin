fun main() {
    println("Введите число m:")
    val m = readLine()!!.toInt()

    println("Введите число n:")
    val n = readLine()!!.toInt()

    if (m % n == 0) {
        println("Частное от деления: ${m / n}")
    } else {
        println("$m на $n нацело не делится")
    }
}
