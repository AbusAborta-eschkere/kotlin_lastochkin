fun main() {
    println("Введите большее число:")
    val num1 = readLine()!!.toInt()

    println("Введите меньшее число:")
    val num2 = readLine()!!.toInt()

    if (num1 % num2 == 0) {
        println("$num1 кратно $num2")
    } else {
        val remainder = num1 % num2
        println("$num1 не кратно $num2. Остаток от деления: $remainder")
    }
}
