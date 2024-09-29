fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val elementToRemove = 3

    val newArray = removeElement(numbers, elementToRemove)

    println("Массив после удаления элемента:")
    for (number in newArray) {
        print("$number ")
    }
}

fun removeElement(array: IntArray, elementToRemove: Int): IntArray {
    val newArray = array.filter { it != elementToRemove }.toIntArray()
    return newArray
}
