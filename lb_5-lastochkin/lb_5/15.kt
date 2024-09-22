fun main() {
    println("Введите строку:")
    val str = readLine()!!.toLowerCase().replace(" ", "") // Приводим к нижнему регистру и убираем пробелы

    if (isPalindrome(str)) {
        println("Строка является палиндромом")
    } else {
        println("Строка не является палиндромом")
    }
}

fun isPalindrome(str: String): Boolean {
    return str == str.reversed()
}
