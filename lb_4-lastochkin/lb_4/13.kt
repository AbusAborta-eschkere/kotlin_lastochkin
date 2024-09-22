fun main() {
    print("Введите код ошибки: ")
    val errorCode = readLine()?.toIntOrNull()

    when (errorCode) {
        100 -> println("Ошибка сети")
        200 -> println("Ошибка сервера")
        300 -> println("Ошибка доступа")
        else -> println("Неизвестная ошибка")
    }
}
