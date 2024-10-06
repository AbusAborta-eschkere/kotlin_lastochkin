fun main() {
    println("Введите целое число:")
    val number = readLine()!!.toInt()

    if (number % 100 == 0) {
        println("$number делится на 100.")
    } else {
        println("$number не делится на 100.")
    }
}
