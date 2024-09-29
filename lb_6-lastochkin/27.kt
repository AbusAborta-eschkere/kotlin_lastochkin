fun main() {
    val numbers = intArrayOf(1, 1, 2, 2, 2, 1, 1, 1, 1, 3, 3, 3)

    val (start, length) = findLongestSequence(numbers)

    println("Максимальная последовательность: ${numbers.sliceArray(start until start + length).joinToString(", ")}")
    println("Длина: $length")
}

fun findLongestSequence(array: IntArray): Pair<Int, Int> {
    if (array.isEmpty()) {
        return 0 to 0
    }

    var maxLength = 1
    var start = 0
    var currentLength = 1
    var currentStart = 0

    for (i in 1 until array.size) {
        if (array[i] == array[i - 1]) {
            currentLength++
        } else {
            if (currentLength > maxLength) {
                maxLength = currentLength
                start = currentStart
            }
            currentLength = 1
            currentStart = i
        }
    }

    if (currentLength > maxLength) {
        maxLength = currentLength
        start = currentStart
    }

    return start to maxLength
}
