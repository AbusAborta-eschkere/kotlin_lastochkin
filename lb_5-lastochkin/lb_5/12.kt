fun main() {
    println("Введите начальное число:")
    val start = readLine()!!.toInt()
    println("Введите шаг:")
    val step = readLine()!!.toInt()

    println("Числовая последовательность:")
    for (i in 0..10) { // Выводим 10 элементов
        println(start + i * step)
    }
}
