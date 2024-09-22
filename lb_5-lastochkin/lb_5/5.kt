fun main() {
    println("Введите число:")
    val number = readLine()!!.toInt()

    var isPrime = true

    if (number <= 1) {
        isPrime = false
    } else {
        for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
            if (number % i == 0) {
                isPrime = false
                break
            }
        }
    }

    if (isPrime) {
        println("$number - простое число")
    } else {
        println("$number - не простое число")
    }
}
