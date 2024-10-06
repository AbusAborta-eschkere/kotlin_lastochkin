fun main() {
    println("Введите число n:")
    val n = readLine()!!.toInt()

    println("Введите число k:")
    val k = readLine()!!.toInt()

    val result = checkPower(n, k)

    if (result) {
        println("k^k равно n")
    } else {
        println("k^k не равно n")
    }
}

fun checkPower(n: Int, k: Int): Boolean {
    return Math.pow(k.toDouble(), k.toDouble()).toInt() == n
}
