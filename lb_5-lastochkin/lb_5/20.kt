fun main() {
    println("Введите начало диапазона:")
    val start = readLine()!!.toInt()
    println("Введите конец диапазона:")
    val end = readLine()!!.toInt()

    println("Простые числа в диапазоне от $start до $end:")
    for (number in start..end) {
        if (isPrime(number)) {
            print("$number ")
        }
    }
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}
