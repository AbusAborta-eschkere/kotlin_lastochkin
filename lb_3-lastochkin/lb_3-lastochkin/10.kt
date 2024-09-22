fun main() {
    println("Введите число a:")
    val a = readLine()!!.toInt()

    println("Введите число b:")
    val b = readLine()!!.toInt()

    if (b % a == 0) {
        println("$a является делителем $b")
    } else {
        println("$a не является делителем $b")
    }
}
