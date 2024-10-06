fun main() {
    println("Введите первое число:")
    val num1 = readLine()!!.toInt()

    println("Введите второе число:")
    val num2 = readLine()!!.toInt()

    val result = isSumLessThan100(num1, num2)

    if (result) {
        println("True")
    } else {
        println("False")
    }
}

fun isSumLessThan100(num1: Int, num2: Int): Boolean {
    return num1 + num2 < 100
}



