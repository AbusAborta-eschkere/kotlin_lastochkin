fun main() {
    val numbers = intArrayOf(1, 2, 3, 2, 1)

    val isPalindrome = numbers.contentEquals(numbers.reversedArray())

    if (isPalindrome) {
        println("Массив является палиндромом.")
    } else {
        println("Массив не является палиндромом.")
    }
}
