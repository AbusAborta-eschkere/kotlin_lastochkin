fun main() {
    println("Введите prob")
    val prob = readLine()!!.toDouble()

    println("Введите prize")
    val prize = readLine()!!.toDouble()

    println("Введите pay")
    val pay = readLine()!!.toDouble()

    val pudge = huk(prob, prize, pay)

    if (pudge) {
        println("True")
    } else {
        println("False")
    }
}

fun huk(prob: Double, prize: Double, pay: Double): Boolean {
    return prob * prize > pay
}
