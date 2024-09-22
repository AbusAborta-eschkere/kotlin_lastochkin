fun main() {
    println("Введите двузначное число:")
    val number = readLine()!!.toInt()

    if (number !in 10..99) {
        println("Число должно быть двузначным!")
        return
    }

    val firstDigit = number / 10
    val secondDigit = number % 10

    // a) Какая из его цифр больше
    if (firstDigit > secondDigit) {
        println("Первая цифра больше")
    } else if (firstDigit < secondDigit) {
        println("Вторая цифра больше")
    } else {
        println("Цифры одинаковы")
    }

    // b) Одинаковы ли его цифры
    if (firstDigit == secondDigit) {
        println("Цифры одинаковы")
    } else {
        println("Цифры разные")
    }
}
