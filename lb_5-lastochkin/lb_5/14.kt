import kotlin.random.Random

fun main() {
    println("10 случайных чисел от 1 до 100:")
    for (i in 1..10) {
        println(Random.nextInt(1, 101)) // Включая 100
    }
}
