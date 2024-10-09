import kotlin.random.Random

fun main() {
    println("Введите желаемую длину пароля:")
    val length = readLine()?.toIntOrNull() ?: 8

    val password = generatePassword(length)
    println("Сгенерированный пароль: $password")
}

fun generatePassword(length: Int): String {
    val chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()"
    return (1..length)
        .map { chars[Random.nextInt(chars.length)] }
        .joinToString("")
}

