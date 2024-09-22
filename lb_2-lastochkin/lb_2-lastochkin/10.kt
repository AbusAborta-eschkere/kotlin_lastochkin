fun main() {
    val x = true
    val y = true
    val z = false

    // a) не X и Y
    val resultA = !x && y
    println("не X и Y: $resultA")

    // b) X или не Y
    val resultB = x || !y
    println("X или не Y: $resultB")

    // c) X или Y и Z
    val resultC = x || y && z
    println("X или Y и Z: $resultC")
}
