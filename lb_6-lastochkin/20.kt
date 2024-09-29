fun main() {
    val progression = IntArray(10) { 2 + (it * 3) }

    println("Арифметическая прогрессия:")
    for (number in progression) {
        print("$number ")
    }
}
