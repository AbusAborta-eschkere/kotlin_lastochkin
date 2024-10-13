fun main() {
    println("Введите текст:")
    val text = readLine()!!

    println("Введите сдвиг (целое число):")
    val shift = readLine()?.toIntOrNull() ?: 1 // По умолчанию сдвиг 1

    val alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
    val shiftedText = text.map { char ->
        if (char.isLetter()) {
            val index = alphabet.indexOf(char.toLowerCase())
            val newIndex = (index + shift) % alphabet.length
            if (char.isUpperCase()) {
                alphabet[newIndex].toUpperCase()
            } else {
                alphabet[newIndex]
            }
        } else {
            char
        }
    }.joinToString("")

    println("Зашифрованный текст: $shiftedText")
}
