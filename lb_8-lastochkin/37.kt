fun main() {
    println("Введите число:")
    val num = readLine()!!.toInt()
    Table(num)
}

fun Table(num: Int) {
    for (i in 1..10) {
        println("$num x $i = ${num * i}")
    }
}
