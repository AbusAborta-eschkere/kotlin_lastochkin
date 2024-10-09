fun isAnagram(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }

    val sortedStr1 = str1.toCharArray().sortedArray().joinToString("")
    val sortedStr2 = str2.toCharArray().sortedArray().joinToString("")

    return sortedStr1 == sortedStr2
}

fun main() {
    println("Введите первую строку:")
    val str1 = readLine()!!

    println("Введите вторую строку:")
    val str2 = readLine()!!

    if (isAnagram(str1, str2)) {
        println("Строки являются анаграммами.")
    } else {
        println("Строки не являются анаграммами.")
    }
}
