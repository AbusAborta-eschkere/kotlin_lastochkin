fun main() {
    println("Введите число:")
    val number = readLine()!!.toDouble()

    println("Введите степень корня:")
    val root = readLine()!!.toInt()

    val result = Math.pow(number, 1.0 / root)
    println("Корень $root степени из $number равен $result")
}
