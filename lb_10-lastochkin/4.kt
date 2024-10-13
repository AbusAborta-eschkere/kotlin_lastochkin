fun fizzBuzz(n: Int): List<Any> {
    return (1..n).map { i ->
        when {
            i % 15 == 0 -> "ВизллБизлл"
            i % 3 == 0 -> "Физллл"
            i % 5 == 0 -> "Бизлллл"
            else -> i
        }
    }
}

fun main() {
    println("Введите число n:")
    val n = readLine()?.toIntOrNull() ?: 0

    val fizzBuzzList = fizzBuzz(n)
    println("fizzBuzz($n) // $fizzBuzzList")
}

