fun main() {
    val numbers = intArrayOf(1, 3, 5, 7, 9, 2, 4, 6, 8, 10)

    val median = findMedian(numbers)

    println("Медиана: $median")
}

fun findMedian(array: IntArray): Double {
    if (array.isEmpty()) {
        return 0.0
    }
    array.sort()
    val middleIndex = array.size / 2
    return if (array.size % 2 == 0) {
        (array[middleIndex - 1] + array[middleIndex]).toDouble() / 2
    } else {
        array[middleIndex].toDouble()
    }
}
