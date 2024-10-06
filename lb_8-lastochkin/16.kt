fun main() {
    println("Введите число:")
    val number = readLine()!!.toInt()
    val isEven = number % 2 == 0
    println("Четное: $isEven")
}