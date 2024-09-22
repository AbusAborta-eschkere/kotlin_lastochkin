fun main() {
    println("Введите первое число:")
    val num1 = readLine()!!.toInt()

    println("Введите второе число:")
    val num2 = readLine()!!.toInt()

    println("Введите третье число:")
    val num3 = readLine()!!.toInt()

    val max = maxOf(num1, num2, num3)
    println("Максимальное число: $max")
}
