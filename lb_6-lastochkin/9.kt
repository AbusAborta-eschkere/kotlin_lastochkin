fun main() {
    // Создание исходного массива
    val originalArray = intArrayOf(1, 2, 3, 4, 5)

    // Создание нового массива с помощью copyOf
    val newArray = originalArray.copyOf()

    // Вывод элементов нового массива
    println("Новый массив:")
    for (number in newArray) {
        print("$number ")
    }
}
