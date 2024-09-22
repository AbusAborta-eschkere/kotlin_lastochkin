fun main() {
    // Запрашиваем количество чисел у пользователя
    print("Введите количество чисел: ")
    val n = readLine()!!.toInt()

    // Создаем список для хранения чисел
    val numbers = mutableListOf<Int>()

    // Ввод чисел с клавиатуры
    println("Введите $n чисел:")
    for (i in 1..n) {
        print("Число $i: ")
        numbers.add(readLine()!!.toInt())
    }

    // Сортировка списка в порядке возрастания
    numbers.sort()

    // Вывод отсортированного списка
    println("Отсортированные числа:")
    for (number in numbers) {
        print("$number ")
    }
}
