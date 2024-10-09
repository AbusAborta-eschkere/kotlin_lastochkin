fun findLongestWord(text: String): String {
    if (text.isEmpty()) {
        throw IllegalArgumentException("Входная строка не может быть пустой")
    }

    val words = text.split("\\s+".toRegex())
        .filter { it.isNotBlank() } // Фильтруем пустые строки
        .maxByOrNull { it.length } // Находим слово с максимальной длиной

    if (words == null) {
        throw IllegalArgumentException("Входная строка не может быть незаполненным отображением")
    }

    return words
}

fun main() {
    println("Введите строку:")
    val text = readLine()!!

    val longestWord = findLongestWord(text)
    println("Самое длинное слово: $longestWord")
}

