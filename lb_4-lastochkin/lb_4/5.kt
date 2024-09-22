fun getSign(number: Int): String {
    return when {
        number > 0 -> "Положительное"
        number < 0 -> "Отрицательное"
        else -> "Нулевое"
    }
}

fun main() {
    val number1 = -555
    val number2 = 3495
    val number3 = 0

    println("Знак числа $number1: ${getSign(number1)}")
    println("Знак числа $number2: ${getSign(number2)}")
    println("Знак числа $number3: ${getSign(number3)}")
}
