fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val searchElement = 7

    val isFound = linearSearch(numbers, searchElement)

    if (isFound) {
        println("Элемент найден в массиве.")
    } else {
        println("Элемент не найден в массиве.")
    }
}

fun linearSearch(array: IntArray, element: Int): Boolean {
    for (number in array) {
        if (number == element) {
            return true
        }
    }
    return false
}
