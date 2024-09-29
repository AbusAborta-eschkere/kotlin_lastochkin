fun main() {
    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(4, 5, 6)
    val array3 = intArrayOf(7, 8, 9)

    val mergedArray = mergeArrays(array1, array2, array3)

    println("Объединенный массив:")
    for (number in mergedArray) {
        print("$number ")
    }
}

fun mergeArrays(vararg arrays: IntArray): IntArray {
    val mergedArray = arrays.reduce { acc, next -> acc + next } // Объединение массивов
    return mergedArray.sortedArray()  // Сортировка массива
}
