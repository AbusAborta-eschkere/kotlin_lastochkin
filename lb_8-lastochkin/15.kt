fun main() {
    println("Введите первое число:")
    val number1 = readLine()!!.toInt()
    println("Введите второе число:")
    val number2 = readLine()!!.toInt()
    val max = if (number1 > number2) number1 else number2
    println("Большее: $max")
}
