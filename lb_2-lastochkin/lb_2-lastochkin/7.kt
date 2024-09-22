fun main() {
    val x = false
    val y = true
    val z = false

    // a) X или Z
    val resultA = x || z
    println("X или Z: $resultA")

    // b) X и Y
    val resultB = x && y
    println("X и Y: $resultB")

    // c) X и Z
    val resultC = x && z
    println("X и Z: $resultC")
}
