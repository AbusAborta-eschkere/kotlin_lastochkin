fun main() {
    println("Введите строку:")
    val str = readLine()!!
    val count = countChars(str)
    println("Количество символов: $count")
}

fun countChars(str: String): Int {
    return str.length
}
