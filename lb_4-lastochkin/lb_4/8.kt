fun getCookingTime(foodType: String): Int {
    return when (foodType.lowercase()) {
        "рис" -> 40
        "гречка" -> 30
        "курица" -> 45
        "мясо" -> 60
        "суп" -> 35
        "каша" -> 25
        else -> 0
    }
}

fun main() {
    print("Введите тип пищи: ")
    val foodType = readLine()

    if (foodType != null) {
        val cookingTime = getCookingTime(foodType)

        if (cookingTime > 0) {
            println("Время приготовления: $cookingTime минут")
        } else {
            println("Неизвестный тип пищи.")
        }
    } else {
        println("Ввод не получен.")
    }
}
