fun main() {
    val x = false
    val y = false
    val z = true

    // a) X или Y и не Z
    val resultA = x || y && !z
    println("X или Y и не Z: $resultA")

    // b) не X и не Y
    val resultB = !x && !y
    println("не X и не Y: $resultB")

    // c) не (X и Z) или Y
    val resultC = !(x && z) || y
    println("не (X и Z) или Y: $resultC")

    // d) X и не Y или Z
    val resultD = x && !y || z
    println("X и не Y или Z: $resultD")

    // e) X и (не Y или Z)
    val resultE = x && (!y || z)
    println("X и (не Y или Z): $resultE")

    // f) X или (не (Y или Z))
    val resultF = x || !(y || z)
    println("X или (не (Y или Z)): $resultF")
}
