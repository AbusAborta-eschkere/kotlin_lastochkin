fun main() {
    println("Введите первое число:")
    val num1 = readLine()!!.toDouble()

    println("Введите второе число:")
    val num2 = readLine()!!.toDouble()

    if (num2 == 0.0) {
        println("Деление на ноль невозможно!")
        return
    }

    val result = num1 / num2
    println("$num1 / $num2 = $result")
}
