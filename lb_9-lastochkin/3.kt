import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    println("Введите сумму в долларах:")
    val amount = readLine()?.toBigDecimalOrNull() ?: BigDecimal.ZERO

    println("Введите курс доллара к евро (например, 0.85):")
    val exchangeRate = readLine()?.toBigDecimalOrNull() ?: BigDecimal.ONE

    val euroAmount = amount.multiply(exchangeRate).setScale(2, RoundingMode.HALF_UP)
    println("$amount долларов = $euroAmount евро")
}

