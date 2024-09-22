fun main() {
    val a = true
    val b = false
    val c = false

    // a) A или не (A и B) или С
    val resultA = a || !(a && b) || c
    println("A или не (A и B) или C: $resultA")

    // b) не A или A и (B или C)
    val resultB = !a || a && (b || c)
    println("не A или A и (B или C): $resultB")

    // c) (A или B и не С) и С
    val resultC = (a || b && !c) && c
    println("(A или B и не С) и С: $resultC")
}
