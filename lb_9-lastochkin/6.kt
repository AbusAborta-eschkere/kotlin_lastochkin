fun main() {
    println("Введите строки через запятую (например, 'apple,banana,cherry'):")
    val inputStrings = readLine()?.split(",") ?: listOf()

    val sortedStrings = sortStrings(inputStrings)

    println("Отсортированные строки:")
    println(sortedStrings.joinToString(", "))
}

fun sortStrings(strings: List<String>): List<String> {
    return strings.sorted()
}