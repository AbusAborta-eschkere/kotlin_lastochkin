fun main() {
    println("Введите длину первой стороны:")
    val side1 = readLine()!!.toInt()

    println("Введите длину второй стороны:")
    val side2 = readLine()!!.toInt()

    println("Введите длину третьей стороны:")
    val side3 = readLine()!!.toInt()

    if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
        println("Треугольник может существовать")
    } else {
        println("Треугольник не может существовать")
    }
}
