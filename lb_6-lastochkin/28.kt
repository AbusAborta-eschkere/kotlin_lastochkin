fun main() {
    println("Введите размер массива:")
    val size = readLine()!!.toInt()

    println("Введите элементы массива через пробел:")
    val input = readLine()!!.split(" ")

    val numbers = input.map { it.toInt() }.toIntArray()

    println("Введенный массив:")
    for (number in numbers) {
        print("$number ")
    }
}
