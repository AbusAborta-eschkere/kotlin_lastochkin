fun main() {
    println("Введите число:")
    val numToTest = readLine()!!.toInt()
    if (numToTest <= 1) {
        println("$numToTest не простое число")
    } else {
        var isPrime = true
        for (i in 2 until numToTest) {
            if (numToTest % i == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            println("$numToTest простое число")
        } else {
            println("$numToTest не простое число")
        }
    }
}

