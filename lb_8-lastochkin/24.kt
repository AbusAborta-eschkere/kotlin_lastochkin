fun main() {
    println("Введите строку:")
    val str = readLine()!!
    val upperStr = toUpperCase(str)
    println("Верхний регистр: $upperStr")
}

fun toUpperCase(str: String): String {
    return str.uppercase()
}
