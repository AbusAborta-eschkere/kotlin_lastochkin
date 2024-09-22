fun main() {
    println("Введите четырехзначное число:")
    val number = readLine()!!.toInt()

    // а) Равна ли сумма двух первых цифр сумме двух последних цифр
    val firstTwoSum = (number / 1000) + ((number % 1000) / 100)
    val lastTwoSum = ((number % 100) / 10) + (number % 10)
    val isSumEqual = firstTwoSum == lastTwoSum
    println("Сумма первых двух цифр равна сумме последних двух: $isSumEqual")

    // б) Кратно ли трем сумма его цифр
    val sumOfDigits = (number / 1000) + ((number % 1000) / 100) + ((number % 100) / 10) + (number % 10)
    val isSumDivisibleByThree = sumOfDigits % 3 == 0
    println("Сумма цифр кратна трем: $isSumDivisibleByThree")

    // в) Кратно ли четырем произведение его цифр
    val productOfDigits = (number / 1000) * ((number % 1000) / 100) * ((number % 100) / 10) * (number % 10)
    val isProductDivisibleByFour = productOfDigits % 4 == 0
    println("Произведение цифр кратно четырем: $isProductDivisibleByFour")

    // г) Кратно ли произведение его цифр числу а
    println("Введите число а:")
    val a = readLine()!!.toInt()
    val isProductDivisibleByA = productOfDigits % a == 0
    println("Произведение цифр кратно $a: $isProductDivisibleByA")
}
