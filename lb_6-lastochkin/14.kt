fun main() {
    val numbers = intArrayOf(1, 3, 5, 9, 12, 15, 18, 21, 24, 27)

    println("Числа, делящиеся на 3:")
    for (number in numbers) {
        if (number % 3 == 0) {
            print("$number ")
        }
    }
}
