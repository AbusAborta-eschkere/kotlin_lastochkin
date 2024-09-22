fun main() {
    println("Введите первое число:")
    val num1 = readLine()!!.toInt()

    println("Введите второе число:")
    val num2 = readLine()!!.toInt()

    println("Введите третье число:")
    val num3 = readLine()!!.toInt()

    if (num1 == num2 || num1 == num3 || num2 == num3) {
        println("Ошибка")
    } else {
        val average = (num1 + num2 + num3) / 3.0
        println("Среднее значение: $average")
    }
}
