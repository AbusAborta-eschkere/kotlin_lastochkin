fun main() {
    println("Введите строку:")
    val str = readLine()!!
    println("Введите подстроку:")
    val subStr = readLine()!!
    val isSubStrPresent = containsSubStr(str, subStr)
    println("Подстрока присутствует: $isSubStrPresent")
}

fun containsSubStr(str: String, subStr: String): Boolean {
    return str.contains(subStr)
}
