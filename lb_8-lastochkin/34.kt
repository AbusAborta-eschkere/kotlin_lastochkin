fun main() {
    println("Введите строку:")
    val str = readLine()!!
    val strWithoutSpaces = removeSpaces(str)
    println("Строка без пробелов: $strWithoutSpaces")
}

fun removeSpaces(str: String): String {
    return str.replace(" ", "")
}
