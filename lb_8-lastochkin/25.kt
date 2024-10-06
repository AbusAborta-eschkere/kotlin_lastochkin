fun main() {
    println("Введите первую строку:")
    val str1 = readLine()!!
    println("Введите вторую строку:")
    val str2 = readLine()!!
    val combinedStr = combineStrings(str1, str2)
    println("Объединенные строки: $combinedStr")
}

fun combineStrings(str1: String, str2: String): String {
    return "$str1 $str2"
}
