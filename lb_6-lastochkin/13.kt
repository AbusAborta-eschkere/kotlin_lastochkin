fun main() {
    val randomNumbers = IntArray(20) { (1..100).random() }

    println("Массив из 20 случайных чисел:")
    for (number in randomNumbers) {
        print("$number ")
    }
}
