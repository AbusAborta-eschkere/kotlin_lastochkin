fun main() {
    print("Введите группу крови (A, B, AB, O): ")
    val bloodType = readLine()?.uppercase()

    when (bloodType) {
        "A" -> println("Можно переливать: A, O")
        "B" -> println("Можно переливать: B, O")
        "AB" -> println("Можно переливать: A, B, AB, O")
        "O" -> println("Можно переливать: O")
        else -> println("Некорректная группа крови.")
    }
}
