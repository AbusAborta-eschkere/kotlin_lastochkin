fun main() {
    println("Введите строку:")
    val str = readLine()!!
    val count = countVowels(str)
    println("Количество гласных: $count")
}

fun countVowels(str: String): Int {
    val vowels = setOf('а', 'е', 'и', 'о', 'у', 'ё', 'ы', 'э', 'ю', 'я', 'А', 'Е', 'И', 'О', 'У', 'Ё', 'Ы','Э', 'Ю', 'Я')
    var count = 0
    for (char in str) {
        if (char in vowels) {
            count++
        }
    }
    return count
}
