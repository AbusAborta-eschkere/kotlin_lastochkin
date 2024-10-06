fun google(number: Int): String {
    return "G" + "o".repeat(number) + "gle"
}

fun main() {
    println("Введите количество букв 'o':")
    val number = readLine()!!.toInt()

    val result = google(number)
    println(result)
}
