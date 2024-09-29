fun main() {
    val array1 = intArrayOf(1, 3, 5, 7, 9)
    val array2 = intArrayOf(2, 4, 6, 8, 10)

    val mergedArray = array1.plus(array2).sortedArray()

    println("Объединенный массив:")
    for (number in mergedArray) {
        print("$number ")
    }
}
