fun main() {
    println("Введите число N:")
    val n = readLine()?.toIntOrNull() ?: 10

    println("Простые числа до $n:")
    for (i in 2..n) {
        if (isPrime(i)) {
            print("$i ")
        }
    }
    println()
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

