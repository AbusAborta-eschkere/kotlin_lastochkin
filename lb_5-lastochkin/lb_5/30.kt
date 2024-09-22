fun main() {
    println("Введите целое число для преобразования в двоичную систему:")
    val decimal = readLine()!!.toInt()

    val binary = decimalToBinary(decimal)
    println("$decimal в двоичной системе: $binary")
}

fun decimalToBinary(decimal: Int): String {
    var binary = ""
    var number = decimal

    while (number > 0) {
        val remainder = number % 2
        binary = remainder.toString() + binary
        number /= 2
    }

    return if (binary.isEmpty()) "0" else binary
}
