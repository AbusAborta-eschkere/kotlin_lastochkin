fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)

    for (i in 0..numbers.size step 5) {
        val group = numbers.sliceArray(i until minOf(i + 5, numbers.size))
        println("Группа ${i / 5 + 1}: ${group.joinToString(", ")}")
    }
}
