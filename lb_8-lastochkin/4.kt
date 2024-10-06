fun main() {
    println("Введите prob")
    val prob = readLine()!!.toDouble()

    println("Введите prize")
    val prize = readLine()!!.toDouble()

    println("Введите pay")
    val pay = readLine()!!.toDouble()

    val puki = kaki(prob, prize, pay)

    if (puki) {
        println("True")
    } else {
        println("False")
    }
}

fun kaki(prob: Double, prize: Double, pay: Double): Boolean {
    return prob * prize > pay
}
