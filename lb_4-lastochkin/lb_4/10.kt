fun main() {
    print("Введите способ оплаты (наличные, кредитная карта, PayPal): ")
    val paymentMethod = readLine()?.lowercase()

    when (paymentMethod) {
        "наличные" -> println("Оплата наличными принята.")
        "кредитная карта" -> println("Оплата кредитной картой принята.")
        "paypal" -> println("Оплата через PayPal принята.")
        else -> println("Неверный способ оплаты.")
    }
}
