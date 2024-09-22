fun main() {
    println("Введите натуральное число:")
    val number = readLine()!!.toInt()

    // а) Является ли оно четным
    if (number % 2 == 0) {
        println("$number - четное число")
    } else {
        println("$number - нечетное число")
    }

    // б) Оканчивается ли оно цифрой 7
    if (number % 10 == 7) {
        println("$number оканчивается цифрой 7")
    } else {
        println("$number не оканчивается цифрой 7")
    }
}
