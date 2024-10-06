fun main() {
    println("Введите текст:")
    val text = readLine()!!
    val isPalindrome = isPalindrome(text)
    println("Палиндром: $isPalindrome")
}

fun isPalindrome(text: String): Boolean {
    val reversedText = text.reversed()
    return text == reversedText
}
