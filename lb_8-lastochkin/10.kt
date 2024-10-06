fun repeatString(txt: String, n: Int): String {
    var result = ""
    for (i in 1..n) {
        result += txt
    }
    return result
}

fun main() {
    println("Введите строку:")
    val txt = readLine()!!

    println("Введите количество повторений:")
    val n = readLine()!!.toInt()

    val repeatedText = repeatString(txt, n)
    println(repeatedText)
}
