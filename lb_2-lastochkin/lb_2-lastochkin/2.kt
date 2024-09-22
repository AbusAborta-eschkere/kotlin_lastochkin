fun analyzeThreeDigitNumber(number: Int): Map<String, Int> {
    if (number !in 100..999) {
        throw IllegalArgumentException("Число должно быть трехзначным!")
    }

    val hundreds = number / 100
    val tens = (number % 100) / 10
    val units = number % 10
    val sumOfDigits = hundreds + tens + units
    val productOfDigits = hundreds * tens * units

    return mapOf(
        "число сотен" to hundreds,
        "число десятков" to tens,
        "число единиц" to units,
        "сумма цифр" to sumOfDigits,
        "произведение цифр" to productOfDigits
    )
}

fun main() {
    val number = 452
    val analysis = analyzeThreeDigitNumber(number)
    println("Для числа $number:")
    println("Число сотен: ${analysis["число сотен"]}")
    println("Число десятков: ${analysis["число десятков"]}")
    println("Число единиц: ${analysis["число единиц"]}")
    println("Сумма цифр: ${analysis["сумма цифр"]}")
    println("Произведение цифр: ${analysis["произведение цифр"]}")
}
