fun main() {
    println("Введите строку:")
    val text = readLine()!!

    val vowels = setOf('а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я', 'А', 'Е', 'Ё', 'И', 'О', 'У', 'Ы', 'Э', 'Ю', 'Я')
    var vowelsCount = 0
    var consonantsCount = 0

    for (char in text) {
        if (char.isLetter()) {
            if (char in vowels) {
                vowelsCount++
            } else {
                consonantsCount++
            }
        }
    }

    println("Количество гласных: $vowelsCount")
    println("Количество согласных: $consonantsCount")
}
