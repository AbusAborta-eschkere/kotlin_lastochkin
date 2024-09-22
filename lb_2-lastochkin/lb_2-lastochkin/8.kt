fun main() {
    val a = true
    val b = false
    val c = false

    // a) не А и В
    val resultA = !a && b
    println("не A и B: $resultA")

    // b) A или не В
    val resultB = a || !b
    println("A или не B: $resultB")

    // c) A и В или С
    val resultC = a && b || c
    println("A и B или C: $resultC")
}
