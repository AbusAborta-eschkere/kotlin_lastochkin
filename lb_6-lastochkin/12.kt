fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    swap(numbers, 1, 3)

    println("Массив после перестановки:")
    for (number in numbers) {
        print("$number ")
    }
}

fun swap(array: IntArray, index1: Int, index2: Int) {
    val temp = array[index1]
    array[index1] = array[index2]
    array[index2] = temp
}
