fun main() {
    println("Введите строку:")
    val text = readLine()!!

    val reversedText = text.reversedCase()
    println("Измененная строка: $reversedText")
}

fun String.reversedCase(): String {
    return this.toCharArray()
        .map { if (it.isLowerCase()) it.toUpperCase() else it.toLowerCase() }
        .joinToString("")
}