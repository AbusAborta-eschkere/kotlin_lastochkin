fun triangleType(a: Int, b: Int, c: Int): String {
    return when {
        a <= 0 || b <= 0 || c <= 0 -> "Некорректные стороны"
        a + b <= c || a + c <= b || b + c <= a -> "Треугольник не существует"
        a == b && b == c -> "Равносторонний"
        a == b || a == c || b == c -> "Равнобедренный"
        else -> "Разносторонний"
    }
}

fun main() {
    print("Введите длину стороны a: ")
    val a = readLine()?.toIntOrNull() ?: 0

    print("Введите длину стороны b: ")
    val b = readLine()?.toIntOrNull() ?: 0

    print("Введите длину стороны c: ")
    val c = readLine()?.toIntOrNull() ?: 0

    println(triangleType(a, b, c))
}
