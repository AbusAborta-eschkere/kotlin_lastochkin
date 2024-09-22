fun main() {
    println("Введите число N:")
    val n = readLine()!!.toInt()

    var a = 0
    var b = 1

    println("Первые $n чисел Фибоначчи:")
    for (i in 1..n) {
        println(a)
        val temp = a + b
        a = b
        b = temp
    }
}
