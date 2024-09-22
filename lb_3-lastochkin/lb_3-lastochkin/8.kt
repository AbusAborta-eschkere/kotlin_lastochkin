fun main() {
    println("Введите расстояние в километрах:")
    val kilometers = readLine()!!.toDouble()

    println("Введите расстояние в футах:")
    val feet = readLine()!!.toDouble()

    val metersFromKilometers = kilometers * 1000
    val metersFromFeet = feet * 0.305

    if (metersFromKilometers < metersFromFeet) {
        println("Расстояние в километрах меньше")
    } else if (metersFromKilometers > metersFromFeet) {
        println("Расстояние в футах меньше")
    } else {
        println("Расстояния равны")
    }
}
