fun main() {
    println("Введите строку:")
    val str = readLine()!!
    val reversedStr = reverseString(str)
    println("Строка в обратном порядке: $reversedStr")
}

fun reverseString(str: String): String {
    return str.reversed()
}
