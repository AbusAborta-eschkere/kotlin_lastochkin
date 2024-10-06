fun main() {
    println("Введите строку:")
    val str = readLine()!!
    val length = findStringLength(str)
    println("Длина строки: $length")
}

fun findStringLength(str: String): Int {
    return str.length
}
