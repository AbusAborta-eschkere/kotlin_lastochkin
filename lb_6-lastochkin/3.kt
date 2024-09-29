fun main() {

    val numbers = intArrayOf(1,2,3,4,5,6,7,8,9)

    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }

    var min = numbers[0]
    for (number in numbers) {
        if (number < min) {
            min = number
        }
    }

    println("Максимальное значение: $max")
    println("Минимальное значение: $min")
}
