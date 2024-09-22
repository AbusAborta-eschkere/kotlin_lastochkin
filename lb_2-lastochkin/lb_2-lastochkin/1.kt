fun analyzeTwoDigitNumber(number: Int): Map<String, Int> {
    if (number !in 10..99) {
        throw IllegalArgumentException("Число должно быть двузначным!")
    }

    val tens = number / 10
    val units = number % 10
    val sumOfDigits = tens + units
    val productOfDigits = tens * units

    return mapOf(
        "число десятков" to tens,
        "число единиц" to units,
        "сумма цифр" to sumOfDigits,
        "произведение цифр" to productOfDigits
    )
}

fun main() {
    val number = 45
    val analysis = analyzeTwoDigitNumber(number)
    println("Для числа $number:")
    println("Число десятков: ${analysis["число десятков"]}")
    println("Число единиц: ${analysis["число единиц"]}")
    println("Сумма цифр: ${analysis["сумма цифр"]}")
    println("Произведение цифр: ${analysis["произведение цифр"]}")
}
